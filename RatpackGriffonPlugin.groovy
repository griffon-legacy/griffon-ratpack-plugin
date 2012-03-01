/*
 * Copyright 2010-2012 the original author or authors.
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
class RatpackGriffonPlugin {
    // the plugin version
    String version = '0.2'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
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
    String source = 'https://github.com/griffon/griffon-ratpack-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Ratpack - embedded micro web framework'
    String description = '''
The Ratpack plugin enables the usage of an embedded [Ratpack][1] server.

Usage
-----

You can create as many Ratpack applications within the same Griffon application. Every Ratpack app will have it's own space
but all share the same servlet context. Dependency injection should work just fine with a Ratpack application; the same can
be said regarding usage of the Artifact API.

Configuration
-------------

At the moment the only setting that can be changed is the port used for the embedded Jetty server, which is 5000 by default.
You can change this setting by specifying a flag in `griffon-app/conf/Config.groovy`

        ratpack.port = 5544

Page templates should be placed in `griffon-app/resources/ratpack/templates`.
Static content should be placed in `griffon-app/resources/ratpack/public`.

Scripts
-------

 * **create-ratpack-app** - creates a new Ratpack definition under `griffon-app/ratpack`.

Examples
--------

Invoking the `create-ratpack-app` with *First* as the application name results in the following file being created
__griffon-app/ratpack/sample/FirstRatpackApp.groovy__

        package sample
        class FirstRatpackApp {
            final Closure routes = {
                get('/') {
                    'Hello from FirstRatpackApp'
                }
            }
        }

Once the application is running you can point a browser to `http://localhost:5000/sample/first/`

[1]: https://github.com/bleedingwolf/Ratpack 
'''
}