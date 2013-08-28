
Prettify data for output
------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/prettify](http://artifacts.griffon-framework.org/plugin/prettify)


This plugin allows you to display human readable, relative timestamps. It is based
on the [PrettyTime][] time formatting library, inspired in the [pretty-time][]
plugin for Grails original by Cazacu Mihai. It also enables the reverse conversion
using [PrettyTimeNLP][].

PrettyTime creates human readable, relative timestamps like those seen on Digg,
Twitter, and Facebook. It's simple, get started 'right now!' and in over 30 languages!

PrettyTime :: NLP is an OpenSource, Java Library - enabling simple parsing and computer
understanding of natural language, and social date references like, "let’s go to dinner
at 6," or "I’ll be on vacation for three days".

## Usage ##

### Module Extensions ###

The plugin adds the following methods

#### `String prettify()` (deprecated) ####

#### `String toPrettyTime()` ####

Added to `java.util.Date` and `java.util.Calendar`. This method may take a Map with additional options:

 * __reference__: starting date of reference. (default: `new Date()`)
 * __capitalize__: capitalize the output text (default: `false`). Ex: "**m**oments ago"
  will be capitalized to "**M**oments ago".
 * __showTime__: show the time (default: `false`). Ex: "2 days ago, **12:00:25 AM**".
 * __format__: the format to use for the date (default: `hh:mm:ss a`). The default
   value is set by `default.date.format` in the I18n bundle, i.e, `messages.properties`.

#### `List<Date> fromPrettyTime()` ####

Added to `java.lang.String`. This method may take an optional `java.util.TimeZone` as argument.

#### `List<DateGroup> fromPrettyTimeSyntax()` ####

Added to `java.lang.String`. This method may take an optional `java.util.TimeZone` as argument.

### Prettyfier ###

The `toPrettyTime()`, `fromPrettyTime()` and `fromPrettyTimeSyntax()` methods are
also available as static methods of the  `griffon.plugins.prettify.Prettyfier` class.

[PrettyTime]: http://ocpsoft.org/prettytime
[PrettyTimeNLP]: http://ocpsoft.org/prettytime/nlp
[pretty-time]: http://grails.org/plugin/pretty-time

