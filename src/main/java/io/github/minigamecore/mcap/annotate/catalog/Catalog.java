/*
 * This file is part of MCAP-Annotate, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2016 - 2016 MinigameCore <http://minigamecore.github.io>
 * Copyright (c) Contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package io.github.minigamecore.mcap.annotate.catalog;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

import org.spongepowered.api.CatalogType;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Annotation marking a {@link CatalogType} implementation.
 */
@Retention(SOURCE)
@Target(TYPE)
public @interface Catalog {

    /**
     * The {@link CatalogType} class.
     *
     * <p>
     *     Cannot be a {@link CatalogType} already provided by Sponge.
     * </p>
     *
     * @return The CatalogType class.
     */
    String catalogTypeClass();

    /**
     * The class containing the {@link #field()} for which the {@link CatalogType} value has to be changed.
     *
     * @return The container class.
     */
    String containerClass();

    /**
     * The {@link CatalogType} field name.
     *
     * <p>
     *     The field should have {@code public static final} modifiers.
     * </p>
     *
     * @return The field name.
     */
    String field();

}
