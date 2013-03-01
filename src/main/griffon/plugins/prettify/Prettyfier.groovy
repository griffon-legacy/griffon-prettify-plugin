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

package griffon.plugins.prettify

import griffon.util.ApplicationHolder
import org.ocpsoft.prettytime.PrettyTime

import static griffon.util.GriffonNameUtils.capitalize

/**
 * @author Andres Almiray
 */
class Prettyfier {
    static String prettify(Date date, Map options = [:]) {
        if (!date) {
            throw new IllegalArgumentException('Invalid input, date is null.')
        }
        doPrettifyDate(date, normalizeOptions(options))
    }

    static String prettify(Calendar calendar, Map options = [:]) {
        if (!calendar) {
            throw new IllegalArgumentException('Invalid input, calendar is null.')
        }
        doPrettifyDate(calendar.time, normalizeOptions(options))
    }

    private static String doPrettifyDate(Date date, Map options) {
        PrettyTime prettyTime = new PrettyTime(options.reference, ApplicationHolder.application.locale)

        String prettyfied = prettyTime.format(date).trim()
        if (options.capitalize) prettyfied = capitalize(prettyfied)
        if (options.showTime) prettyfied += ', ' + date.format(options.format)
        prettyfied
    }

    private static Map normalizeOptions(Map options) {
        Map normalized = [
            reference: options.reference ?: new Date(),
            showTime: options.showTime ?: false,
            capitalize: options.capitalize ?: false,
            format: options.format ?: ApplicationHolder.application.getMessage('default.date.format', 'hh:mm:ss a')
        ]

        normalized.showTime = normalized.showTime as boolean
        normalized.capitalize = normalized.capitalize as boolean

        normalized
    }
}
