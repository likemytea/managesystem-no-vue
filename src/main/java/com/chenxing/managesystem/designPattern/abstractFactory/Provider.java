package com.chenxing.managesystem.designPattern.abstractFactory;

import com.chenxing.managesystem.designPattern.ordinaryFactory.MyInterface;

/**
 * 抽象工厂
 */
public interface Provider {
	public MyInterface produce();
}
