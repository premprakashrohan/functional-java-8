/**
 * With Java 8, a new Date-Time API is introduced to cover the following drawbacks of old date-time API.

    Not thread safe − java.util.Date is not thread safe, thus developers have to deal with concurrency issue while using date. The new date-time API is immutable and does not have setter methods.

    Poor design − Default Date starts from 1900, month starts from 1, and day starts from 0, so no uniformity. The old API had less direct methods for date operations. The new API provides numerous utility methods for such operations.

    Difficult time zone handling − Developers had to write a lot of code to deal with timezone issues. The new API has been developed keeping domain-specific design in mind.

Java 8 introduces a new date-time API under the package java.time. Following are some of the important classes introduced in java.time package.

    Local − Simplified date-time API with no complexity of timezone handling.

    Zoned − Specialized date-time API to deal with various timezones.

 */
/**
 * @author ishi
 *
 */
package com.ki.DateTime;