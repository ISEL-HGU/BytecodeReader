/*
 * Copyright (c) 1996, 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package edu.handong.csee.isel.bytecodeparser.asm.jasm;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 */
class BootstrapMethodData extends Argument implements Data {

    ConstantPool.ConstCell bootstrapMethodHandle;
    ArrayList<ConstantPool.ConstCell> arguments;
    public int placeholder_index = -1;

    public BootstrapMethodData(ConstantPool.ConstCell bsmHandle, ArrayList<ConstantPool.ConstCell> arguments) {
        super();
        this.bootstrapMethodHandle = bsmHandle;
        this.arguments = arguments;
    }

    public BootstrapMethodData(int placeholder) {
        super();
        this.bootstrapMethodHandle = null;
        this.arguments = null;
        this.placeholder_index = placeholder;
    }

    public int getLength() {
        return 4 + arguments.size() * 2;
    }

    public boolean isPlaceholder() {
        return placeholder_index > -1;
    }

    public void write(CheckedDataOutputStream out) throws IOException {
        out.writeShort(bootstrapMethodHandle.arg);
        out.writeShort(arguments.size());

        for (ConstantPool.ConstCell argument : arguments) {
            out.writeShort(argument.arg);
        }
    }
}
