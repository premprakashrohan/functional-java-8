package com.ki.parallel;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

public class PerformanceMesurment {

	public static void main(String[] args) {
		sumTradesInSerial();
		sumTreadsInParallel();

	}

	private static void sumTreadsInParallel() {
		List<Trade> trades = TradeUtil.createTrades(10000);
		//trades.stream().forEach(System.out::println);
		Instant start = Instant.now();
		Integer sum = trades.stream() .map(Trade::getQuantity).limit(9999).reduce(Integer::sum).get();
		System.out.println(sum);
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.printf("%s %d %s", "Aggrigation of trades took ", duration.toMillis(), " ms in sequencial mode !!!");

	}

	private static void sumTradesInSerial() {
		List<Trade> trades = TradeUtil.createTrades(10000);
		Instant start = Instant.now();
		Integer sum = trades.stream().map(Trade::getQuantity).limit(9999).reduce(Integer::sum).get();
		System.out.println(sum);
		Instant end = Instant.now();
		Duration duration = Duration.between(start, end);
		System.out.printf("%s %d %s", "Aggrigation of trades took ", duration.toMillis(), " ms in sequencial mode !!!");

	}
}
