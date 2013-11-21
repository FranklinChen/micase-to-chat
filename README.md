## MICASE to CHAT

### DTD

Convert DTD to XML Schema using Trang:

``` console
$ trang micasex.dtd src/main/xsd/micasex.xsd
```

Note: require `micasex.dtd` for Scala XML load of XML file!

The DTD does not seem to match the XML data!

```
PUBLICATIONSTMT expected but WORDCOUNT found
```

``` console
$ xmllint --dtdvalid micasex.dtd --nowarning --noout src/test/resources/adv700ju023.xml
```

Changed `micasex.dtd` to include:

```
<!ELEMENT FILEDESC (TITLESTMT, WORDCOUNT, PUBLICATIONSTMT, SOURCEDESC+)>
<!ELEMENT WORDCOUNT (#PCDATA)>
```

That is the only change needed.
