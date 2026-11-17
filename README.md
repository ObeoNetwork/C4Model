# Prototype Sample modeler for the C4 model using Sirius Web

This is a prototype of a modeler for the [C4 Model](https://c4model.com) using [Eclipse Sirius Web](https://github.com/eclipse-sirius/sirius-web)

## Building & Running

First follow the [Sirius Web setup instructions](https://github.com/eclipse-sirius/sirius-web/) related to the Docker/PostgreSQL and Frontend concerns.

For the backend, from an IDE or the command-line, install the following two dependencies locally:
* `mvn install` on `C4Model.c4-metamodel/pom.xml`
* `mvn install` on `sirius-components-c4-starter/pom.xml`

Then follow the Sirius Web instructions related to the backend for running the sample application as a Spring Boot App.

## Editing

* For the C4 metamodel, see instructions in `c4-metamodel/README.md`
* For the C4 Sirius Web starter and the Sirius Web sample application, refer to the [Sirius Web instructions](https://github.com/eclipse-sirius/sirius-web/)

## License

This project is licensed under the [Eclipse Public License 2.0](LICENSE) (`SPDX-License-Identifier: EPL-2.0`).

The reference diagrams in `sirius-web-with-c4-starter/sirius-components-c4-starter/diagrams-spec/` come from the [C4 model](https://c4model.com/) website and are licensed under CC BY 4.0; see the README in that folder.
