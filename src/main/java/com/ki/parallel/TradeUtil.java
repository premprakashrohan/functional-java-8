package com.ki.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ki.random.RandomAll;

public class TradeUtil {
	

	public static List<Trade> createTrades(int j) {
		return IntStream.iterate(0, i -> i + 1).parallel()
	            .limit(j)
	            .mapToObj(i->new Trade (RandomAll.getString(7),RandomAll.getInt(1, 10),RandomAll.getDouble(100, 1000),TradeStatus.OPEN))
	            .collect(Collectors.toList());
	}

}
