#totoridipjp4J

[![Build Status](https://travis-ci.org/wakamesoba98/totoridipjp4J.svg?branch=master)](https://travis-ci.org/wakamesoba98/totoridipjp4J)

##なにこれ

totori.dip.jp のトップ画像取得 API を呼び出すライブラリです。

http://totori.dip.jp/api_doc.txt

##使用例

```java
TotoriDipJPFactory factory = new TotoriDipJPFactory();
TotoriDipJP totori = factory.getInstance();

TopImg topImg = totori.getTopImg();
String url = topImg.getUrl();

System.out.println(url);
```
