package com.ki.threds;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureDemo {

	public static void main(String[] args) {
		try {
			List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 9, 14, 777, 1098);
			list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
					.map(cf -> cf.thenApply(n -> n * n)).map(t -> t.join()).forEach(s -> System.out.println(s));
		} catch (Exception e) {
			e.printStackTrace();
		}

		final ExecutorService executor = Executors.newFixedThreadPool(4);

		@SuppressWarnings("unused")
		List<String> topSites = Arrays.asList("www.google.com", "www.youtube.com", "www.yahoo.com", "www.msn.com");

		List<CompletableFuture<Double>> relevanceFutures = null;
		Stream<String> stream = topSites.stream();
		Stream<Object> stream1 = stream.map(site -> CompletableFuture.supplyAsync(() -> downloadSite(site), executor));
		// stream = stream1.map(contentFuture -> contentFuture.thenApply(this::parse));
		// stream = stream.map(docFuture ->
		// docFuture.thenCompose(this::calculateRelevance));
		// relevanceFutures=
		// stream.collect(Collectors.<CompletableFuture<Double>>toList());

	}

	private static int getNumber(int a) {
		return a * a;
	}

	private static String downloadSite(final String site) {
		try {
			System.out.printf("Downloading {0}", site);
			final String res = org.apache.commons.io.IOUtils.toString(new URL("http://" + site), "UTF_8");
			System.out.printf("Done {0}", site);
			return res;
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return "Hello";
	}
}