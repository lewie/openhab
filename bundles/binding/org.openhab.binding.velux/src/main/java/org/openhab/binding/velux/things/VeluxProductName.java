/**
 * Copyright (c) 2010-2019 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.velux.things;

/**
 * <B>Velux</B> product representation.
 * <P>
 * Combined set of information describing a single Velux product.
 *
 * @author Guenther Schreiner - initial contribution.
 * @since 1.13.0
 */
public class VeluxProductName {

    private String name;

    public VeluxProductName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
