/*
 * Copyright (c) 1996, 2017, Oracle and/or its affiliates. All rights reserved.
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

/**
 * This interface defines constant that are used throughout the compiler. It inherits from
 * RuntimeConstants, which is an autogenerated class that contains constants defined in
 * the interpreter.
 */
public interface Constants extends RuntimeConstants {


    /**
     * End of input
     */
    public static final int EOF        = -1;

    /*
     * Flags
     */
    public static final int F_VERBOSE        = 1 << 0;
    public static final int F_DUMP           = 1 << 1;
    public static final int F_WARNINGS       = 1 << 2;
    public static final int F_DEBUG          = 1 << 3;
    public static final int F_OPTIMIZE       = 1 << 4;
    public static final int F_DEPENDENCIES   = 1 << 5;

    /*
     * Type codes
     */
    public static final int TC_BOOLEAN   = 0;
    public static final int TC_BYTE      = 1;
    public static final int TC_CHAR      = 2;
    public static final int TC_SHORT     = 3;
    public static final int TC_INT       = 4;
    public static final int TC_LONG      = 5;
    public static final int TC_FLOAT     = 6;
    public static final int TC_DOUBLE    = 7;
    public static final int TC_NULL      = 8;
    public static final int TC_ARRAY     = 9;
    public static final int TC_CLASS     = 10;
    public static final int TC_VOID      = 11;
    public static final int TC_METHOD    = 12;
    public static final int TC_ERROR     = 13;

    /*
     * Type Masks
     */
    public static final int TM_NULL      = 1 << TC_NULL;
    public static final int TM_VOID      = 1 << TC_VOID;
    public static final int TM_BOOLEAN   = 1 << TC_BOOLEAN;
    public static final int TM_BYTE      = 1 << TC_BYTE;
    public static final int TM_CHAR      = 1 << TC_CHAR;
    public static final int TM_SHORT     = 1 << TC_SHORT;
    public static final int TM_INT       = 1 << TC_INT;
    public static final int TM_LONG      = 1 << TC_LONG;
    public static final int TM_FLOAT     = 1 << TC_FLOAT;
    public static final int TM_DOUBLE    = 1 << TC_DOUBLE;
    public static final int TM_ARRAY     = 1 << TC_ARRAY;
    public static final int TM_CLASS     = 1 << TC_CLASS;
    public static final int TM_METHOD    = 1 << TC_METHOD;
    public static final int TM_ERROR     = 1 << TC_ERROR;

    public static final int TM_INT32     = TM_BYTE | TM_SHORT | TM_CHAR | TM_INT;
    public static final int TM_NUM32     = TM_INT32 | TM_FLOAT;
    public static final int TM_NUM64     = TM_LONG | TM_DOUBLE;
    public static final int TM_INTEGER   = TM_INT32 | TM_LONG;
    public static final int TM_REAL      = TM_FLOAT | TM_DOUBLE;
    public static final int TM_NUMBER    = TM_INTEGER | TM_REAL;
    public static final int TM_REFERENCE = TM_ARRAY | TM_CLASS | TM_NULL;

    /*
     * Class status
     */
    public static final int CS_UNDEFINED        = 0;
    public static final int CS_UNDECIDED        = 1;
    public static final int CS_BINARY           = 2;
    public static final int CS_SOURCE           = 3;
    public static final int CS_PARSED           = 4;
    public static final int CS_COMPILED         = 5;
    public static final int CS_NOTFOUND         = 6;

    /*
     * Attributes
     */
    public static final int ATT_ALL             = -1;
    public static final int ATT_CODE            = 1;

    /*
     * Number of bits used in file offsets
     */
    public static final int OFFSETBITS          = 19;
    public static final int MAXFILESIZE         = (1 << OFFSETBITS) - 1;
    public static final int MAXLINENUMBER       = (1 << (32 - OFFSETBITS)) - 1;

    /*
     * Operator precedence
     */
    /* Who uses this????
    public static final int opPrecedence[] = {
        10,  11,  11,  11,  11,  11,  11,  11,  11,  11,
        11,  11,  11,  12,  13,  14,  15,  16,  17,  18,
        18,  19,  19,  19,  19,  19,  20,  20,  20,  21,
        21,  22,  22,  22,  23,  24,  24,  24,  24,  24,
        24,  25,  25,  26,  26,  26,  26,  26,  26
    };
    * */
}
