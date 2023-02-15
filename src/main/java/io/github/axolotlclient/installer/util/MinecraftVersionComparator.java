/*
 * Copyright © 2023-2023 moehreag <moehreag@gmail.com>, TheKodeToad <TheKodeToad@proton.me> & Contributors
 *
 * This file is part of AxolotlClient Installer.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * For more information, see the LICENSE file.
 */

package io.github.axolotlclient.installer.util;

import java.util.Comparator;

// TODO: snapshots!
public class MinecraftVersionComparator implements Comparator<String> {

    public static final MinecraftVersionComparator INSTANCE = new MinecraftVersionComparator();

    @Override
    public int compare(String o1, String o2) {
        int[] a = Util.parseSemVer(o1);
        int[] b = Util.parseSemVer(o2);

        if (a[0] > b[0])
            return 1;
        if (a[0] < b[0])
            return -1;
        if (a[1] > b[1])
            return 1;
        if (a[1] < b[1])
            return -1;
        if (a[2] > b[2])
            return 1;
        if (a[2] < b[2])
            return -1;

        return 0;
    }
}
