# C4 Model

This is the Ecore metamodel for the [C4 Model](https://c4model.com/).

## Building

`mvn clean verify`

## Editing

* IDE: Download Eclipse Modeling 2023-12 from https://www.eclipse.org/downloads/packages/release/2023-12/r

Additional plug-ins:

* Help > Install New Software... and add https://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/ so your IDE can resolve Xtext dependencies.
* From the same menu, install the sole feature from https://download.eclipse.org/cbi/updates/tpd/nightly/latest
* From https://download.eclipse.org/eclipse/updates/4.23/ install the following: "Eclipse XML Editors and Tools", "M2E - Maven Integration for Eclipse"

After restarting the IDE:

* Right click on '/fr.obeo.dsl.C4.releng.target/C4Model.tpd' and select 'Set as Target Platform'