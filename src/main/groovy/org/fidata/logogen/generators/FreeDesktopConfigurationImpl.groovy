// SPDX-FileCopyrightText: ©  Basil Peace
// SPDX-License-Identifier: Apache-2.0
package org.fidata.logogen.generators

import com.google.common.collect.ImmutableSet
import groovy.transform.CompileStatic
import org.fidata.logogen.shared.configurations.Default
import org.fidata.logogen.shared.configurations.Name
import org.fidata.logogen.shared.configurations.impl.DefaultImpl
import org.fidata.logogen.shared.configurations.impl.NameImpl
import org.fidata.groovy.utils.ImmutableWithCustomConstructors

@ImmutableWithCustomConstructors
@CompileStatic
final class FreeDesktopConfigurationImpl implements FreeDesktopConfiguration {
  @Delegate
  private final Default aDefault
  @Delegate
  private final Name name
  final String theme
  final Set<Integer> sizes

  FreeDesktopConfigurationImpl(File srcFile, String logoName, String theme, Set<Integer> sizes) {
    this.@aDefault = new DefaultImpl(srcFile)
    this.@name = new NameImpl(logoName)
    this.@theme = theme
    this.@sizes = ImmutableSet.copyOf(sizes)
  }
}
