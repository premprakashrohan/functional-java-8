package com.ki.threds;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;

import org.h2.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		ExecutorService esa = Executors.newCachedThreadPool(new NamedThreadFactory());
		ExecutorService es1 = Executors.newFixedThreadPool(2);
		ExecutorService es2 = Executors.newSingleThreadExecutor();
		ExecutorService es3 = Executors.newWorkStealingPool();
		ExecutorService es4 = Executors.newScheduledThreadPool(2);
		ExecutorService es5 = Executors.newSingleThreadScheduledExecutor();
	}

}


class NamedThreadFactory implements ThreadFactory {
	 
    /**
     *Atomic operation guarantees that each thread has a unique
     */
    private static final AtomicInteger threadNumber=new AtomicInteger(1);
 
    private final AtomicInteger mThreadNum = new AtomicInteger(1);
 
    private final String prefix;
 
    private final boolean daemoThread;
 
    private final ThreadGroup threadGroup;
 
   public NamedThreadFactory() {
        this("rpcserver-threadpool-" + threadNumber.getAndIncrement(), false);
    }
 
    public NamedThreadFactory(String prefix) {
        this(prefix, false);
    }
 
 
    public NamedThreadFactory(String prefix, boolean daemo) {
        this.prefix = !StringUtils.isNullOrEmpty(prefix) ? prefix + "-thread-" : "";
        daemoThread = daemo;
        SecurityManager s = System.getSecurityManager();
        threadGroup = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
    }
 
    @Override
    public Thread newThread(Runnable runnable) {
        String name = prefix + mThreadNum.getAndIncrement();
        Thread ret = new Thread(threadGroup, runnable, name, 0);
        ret.setDaemon(daemoThread);
        return ret;
    }
}