/*
 Copyright © 2020-2022 Petr Panteleyev <petr@panteleyev.org>
 SPDX-License-Identifier: BSD-2-Clause
 */
package com.mehdiben;

import java.util.regex.Matcher;

final class StringUtil {
    private StringUtil() {
    }

    private static final String REPLACER = Matcher.quoteReplacement(OsUtil.isWindows() ? "\\\\\\\"" : "\\\"");
    private static final String SPACE_WRAPPER = OsUtil.isWindows() ? "\\\"" : "\"";

    static String escape(String arg) {
        arg = arg.replaceAll("\"", REPLACER);
        if (arg.contains(" ")) {
            arg = SPACE_WRAPPER + arg + SPACE_WRAPPER;
        }

        return arg;
    }

    static boolean isNotEmpty(String s) {
        return s != null && s.trim().length() > 0;
    }

    static boolean isEmpty(String s) {
        return s == null || s.trim().length() == 0;
    }
}
