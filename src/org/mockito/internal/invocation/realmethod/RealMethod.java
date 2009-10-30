/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.invocation.realmethod;

import java.io.Serializable;

public interface RealMethod extends Serializable {

    Object invoke(Object target, Object[] arguments) throws Throwable;

}
