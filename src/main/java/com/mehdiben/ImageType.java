/*
 Copyright © 2020-2022 Petr Panteleyev <petr@panteleyev.org>
 SPDX-License-Identifier: BSD-2-Clause
 */
package com.mehdiben;

public enum ImageType implements EnumParameter {
    APP_IMAGE("app-image"),
    DMG("dmg"),
    PKG("pkg"),
    EXE("exe"),
    MSI("msi"),
    RPM("rpm"),
    DEB("deb");

    private final String value;

    ImageType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
