/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class PrettifyGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.2.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-prettify-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Prettify data for output'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}
