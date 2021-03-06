/* LocaleInformation_ta_IN.java
   Copyright (C) 2002 Free Software Foundation, Inc.

This file is part of GNU Classpath.

GNU Classpath is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2, or (at your option)
any later version.

GNU Classpath is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

You should have received a copy of the GNU General Public License
along with GNU Classpath; see the file COPYING.  If not, write to the
Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
02110-1301 USA.

Linking this library statically or dynamically with other modules is
making a combined work based on this library.  Thus, the terms and
conditions of the GNU General Public License cover the whole
combination.

As a special exception, the copyright holders of this library give you
permission to link this library with independent modules to produce an
executable, regardless of the license terms of these independent
modules, and to copy and distribute the resulting executable under
terms of your choice, provided that you also meet, for each linked
independent module, the terms and conditions of the license of that
module.  An independent module is a module which is not derived from
or based on this library.  If you modify this library, you may extend
this exception to your version of the library, but you are not
obligated to do so.  If you do not wish to do so, delete this
exception statement from your version. */


// This file was automatically generated by localedef.

package gnu.java.locale;

import java.util.ListResourceBundle;

public class LocaleInformation_ta_IN extends ListResourceBundle
{
  static final String decimalSeparator = ".";
  static final String groupingSeparator = ",";
  static final String numberFormat = "#,##,##0.###";
  static final String percentFormat = "#,##,##0%";
  static final String[] weekdays = { null, "\u0B9E\u0BBE\u0BAF\u0BBF\u0BB1\u0BC1", "\u0BA4\u0BBF\u0B99\u0BCD\u0B95\u0BB3\u0BCD", "\u0B9A\u0BC6\u0BB5\u0BCD\u0BB5\u0BBE\u0BAF\u0BCD", "\u0BAA\u0BC1\u0BA4\u0BA9\u0BCD", "\u0BB5\u0BBF\u0BAF\u0BBE\u0BB4\u0BA9\u0BCD", "\u0BB5\u0BC6\u0BB3\u0BCD\u0BB3\u0BBF", "\u0B9A\u0BA9\u0BBF" };

  static final String[] shortWeekdays = { null, "\u0B9E", "\u0BA4", "\u0B9A", "\u0BAA", "\u0BB5", "\u0BB5", "\u0B9A" };

  static final String[] shortMonths = { "\u0B9C\u0BA9\u0BB5\u0BB0\u0BBF", "\u0BAA\u0BC6\u0BAA\u0BCD\u0BB0\u0BB5\u0BB0\u0BBF", "\u0BAE\u0BBE\u0BB0\u0BCD\u0B9A\u0BCD", "\u0B8F\u0BAA\u0BCD\u0BB0\u0BB2\u0BCD", "\u0BAE\u0BC7", "\u0B9C\u0BC2\u0BA9\u0BCD", "\u0B9C\u0BC2\u0BB2\u0BC8", "\u0B86\u0B95\u0BB8\u0BCD\u0B9F\u0BCD", "\u0B9A\u0BC6\u0BAA\u0BCD\u0B9F\u0BAE\u0BCD\u0BAA\u0BB0\u0BCD", "\u0B85\u0B95\u0BCD\u0B9F\u0BCB\u0BAA\u0BB0\u0BCD", "\u0BA8\u0BB5\u0BAE\u0BCD\u0BAA\u0BB0\u0BCD", "\u0B9F\u0BBF\u0B9A\u0BAE\u0BCD\u0BAA\u0BB0\u0BCDr", null };

  static final String[] months = { "\u0B9C\u0BA9\u0BB5\u0BB0\u0BBF", "\u0BAA\u0BC6\u0BAA\u0BCD\u0BB0\u0BB5\u0BB0\u0BBF", "\u0BAE\u0BBE\u0BB0\u0BCD\u0B9A\u0BCD", "\u0B8F\u0BAA\u0BCD\u0BB0\u0BB2\u0BCD", "\u0BAE\u0BC7", "\u0B9C\u0BC2\u0BA9\u0BCD", "\u0B9C\u0BC2\u0BB2\u0BC8", "\u0B86\u0B95\u0BB8\u0BCD\u0B9F\u0BCD", "\u0B9A\u0BC6\u0BAA\u0BCD\u0B9F\u0BAE\u0BCD\u0BAA\u0BB0\u0BCD", "\u0B85\u0B95\u0BCD\u0B9F\u0BCB\u0BAA\u0BB0\u0BCD", "\u0BA8\u0BB5\u0BAE\u0BCD\u0BAA\u0BB0\u0BCD", "\u0B9F\u0BBF\u0B9A\u0BAE\u0BCD\u0BAA\u0BB0\u0BCDr", null };

  static final String[] ampms = { "\u0B95\u0BBE\u0BB2\u0BC8", "\u0BAE\u0BBE\u0BB2\u0BC8" };

  static final String shortDateFormat = "EEEE dd MMMM yyyy";
  static final String defaultTimeFormat = "hh:m:s a z";
  static final String currencySymbol = "\u20A8";
  static final String intlCurrencySymbol = "INR";
  static final String currencyFormat = "$ #,##,##0.00;-$ #,##,##0.00";

  private static final Object[][] contents =
  {
    { "weekdays", weekdays },
    { "shortWeekdays", shortWeekdays },
    { "shortMonths", shortMonths },
    { "months", months },
    { "ampms", ampms },
    { "shortDateFormat", shortDateFormat },
    { "defaultTimeFormat", defaultTimeFormat },
    { "currencySymbol", currencySymbol },
    { "intlCurrencySymbol", intlCurrencySymbol },
    { "currencyFormat", currencyFormat },
    { "decimalSeparator", decimalSeparator },
    { "groupingSeparator", groupingSeparator },
    { "numberFormat", numberFormat },
    { "percentFormat", percentFormat },
  };

  public Object[][] getContents () { return contents; }
}
