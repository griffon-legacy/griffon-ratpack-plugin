
Ratpack - embedded micro web framework
--------------------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/ratpack](http://artifacts.griffon-framework.org/plugin/ratpack)


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

