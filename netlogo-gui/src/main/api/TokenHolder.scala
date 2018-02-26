// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.api

import org.nlogo.core.Token

@deprecated("6.0.3", "User core.TokenHolder instead")
trait TokenHolder {
  def token(t:Token)
}
