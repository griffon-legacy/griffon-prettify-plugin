
Prettify data for output
------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/prettify](http://artifacts.griffon-framework.org/plugin/prettify)


This plugin allows you to display human readable, relative timestamps. It is based
on the [PrettyTime][] time formatting library. inspired in the [pretty-time][]
plugin for Grails original by Cazacu Mihai.

PrettyTime creates human readable, relative timestamps like those seen on Digg,
Twitter, and Facebook. It’s simple, get started “right now!” and in over 25 languages!

## Usage ##

### Module Extensions ###

The plugin adds a `prettify()` method to `java.util.Date` and `java.util.Calendar`.
This method may take a Map with additional options:

 * __reference__: starting date of reference. (default: `new Date()`)
 * __capitalize__: capitalize the output text (default: `false`). Ex: "**m**oments ago"
  will be capitalized to "**M**oments ago".
 * __showTime__: show the time (default: `false`). Ex: "2 days ago, **12:00:25 AM**".
 * __format__: the format to use for the date (default: `hh:mm:ss a`). The default
   value is set by `default.date.format` in the I18n bundle, i.e, `messages.properties`.

### Pretifier ###

The `prettify()` methods are also available as static methods of the
`griffon.plugins.prettify.Pretifier` class.

[PrettyTime]: http://ocpsoft.org/prettytime
[pretty-time]: http://grails.org/plugin/pretty-time

