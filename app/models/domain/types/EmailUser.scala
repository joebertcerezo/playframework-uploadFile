package models
package domain
package types

import play.api.libs.json.*
import play.api.data.format.Formatter

import JsonFormats.*

opaque type EmailUser = String
object EmailUser {
  def apply(value: String): EmailUser = value

  given Format[EmailUser] =
    opaqueFormat(_.validate[String], value => JsString(value.toString()))

  given Formatter[EmailUser] = opaqueFormatter(EmailUser.apply, _.value)

  extension (x: EmailUser) def value: String = x
}
