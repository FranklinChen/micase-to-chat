## MICASE to CHAT

### DTD

``` console
$ xmlstarlet val -d micasex.dtd src/test/resources/adv700ju023.xml
```

Convert DTD to XML Schema using Trang:

``` console
$ trang micasex.dtd src/main/xsd/micasex.xsd
```

Note: require `micasex.dtd` for Scala XML load of XML file!

The DTD does not seem to match the XML data!

```
PUBLICATIONSTMT expected but WORDCOUNT found
```


Changed `micasex.dtd` to include:

```
<!ELEMENT FILEDESC (TITLESTMT, WORDCOUNT, PUBLICATIONSTMT, SOURCEDESC+)>
<!ELEMENT WORDCOUNT (#PCDATA)>
```

That is the only change needed.


### XSD

Verify against the generated XSD.

``` console
$ xmlstarlet val -s src/main/xsd/micasex.xsd src/test/resources/adv700ju023.xml
```
