package com.lxj.test;

import java.util.logging.LogManager;

import org.apache.logging.log4j.Logger;

/**
 * TestLog
 */
public class TestLog {

    private static final Logger logger = org.apache.logging.log4j.LogManager.getLogger();

    public static void main(String[] args) {
        logger.trace("跟踪信息");
        logger.debug("调试信息");
        logger.info("输出信息");
        logger.warn("警告信息");
        logger.error("错误信息");
        logger.fatal("致命信息");
    }
}