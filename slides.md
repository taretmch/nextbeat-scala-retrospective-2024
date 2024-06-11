---
theme: seriph
title: ScalaMatsuri 2024 の発表振り返り
class: text-center
highlighter: shiki
drawings:
  persist: false
transition: (slide)-left
mdc: true
layout: intro
---

# ScalaMatsuri 2024 の発表振り返り

NB-Scala レトロスペクティブ (#NextMatsuri)

---

# 自己紹介

<div class="container">
  <div class="left">
    <ul>
      <li>ScalaMatsuri には2021年から参加 (2023年、2024年にオフライン参加 🏮)</li>
      <li>Scala は実務で触り始めて5年目</li>
      <li>Platform チームで、社内の共通ライブラリ (Scala, TypeScript, Capacitor) の開発や認証基盤の開発を担当</li>
    </ul>
  </div>
  <div class="right">
    <img src="/images/icon.png" />
    <div class="links">
      <a href="https://twitter.com/taretmch" target="_blank">@taretmch</a>
      <a href="https://github.com/taretmch" target="_blank">github</a>
    </div>
  </div>
</div>

<style scoped>
.container {
    display: flex;
}
.left {
    margin-right: 10px;
}
img {
    height: 70%;
    margin: auto;
}
.links {
    margin-top: 10px;
    text-align: center;
    color: #0077b5;
}
.links a {
    margin: 0 5px;
}
</style>

---

# 会社紹介

- 株式会社ネクストビート
- Scala 2.12, Scala 2.13, Scala 3 を使って開発している
- SaaS、シェアリングエコノミー、メディア、求人応募など様々な事業を展開している
- Scala の事業で主に扱っているドメイン
  - 労務管理、シフト管理
  - 保育
  - スケジュール、予約管理
  - 料金計算、請求
  - etc.

---

# 本日の発表の目標

- ScalaMatsuri 2024 の発表を振り返り、実務にどう応用できるか考える
- ScalaMatsuri に行けなかったけど、行った気になれる
- 来年は参加してみたい！という気持ちになる

---

# ScalaMatsuri 2024 お疲れさまでした！

<style scoped>
.container {
    display: flex;
    width: 70%;
    margin: auto;
}
.left, .right {
    padding: 10px;
}
.left {
    flex: 1;
    display: flex;
    justify-content: center;
    align-items: center;
}
.right {
    flex: 1;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
}
.right img {
    width: 100%;
    margin-bottom: 10px;
}
.left img {
    width: 100%;
    height: auto;
}
</style>

<div class="container">
  <div class="left">
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_9993.png" />
  </div>
  <div class="right">
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_0006.png" />
    <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_9999.png" />
  </div>
</div>

---

# ScalaMatsuri 2024 の概要

- [アジア最大級の Scala カンファレンス](https://scalamatsuri.org/ja)
- 日時：2024年6月8日(土)、6月9日(日)
- 会場: 東京・台場
- <span v-mark.underline.orange>2019年以来のオフライン開催！</span>

<div class="image-container">
  <img src="/images/matsuri.png">
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  top: 100px;
}
img {
  width: 300px;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 雰囲気

- 昨年ハイブリッドでオフライン参加したが、雰囲気が全く違った
- Scala 好きの人が集まっていて、熱気があった
- 英語の発表も多く、グローバル！

<div class="image-container">
  <img src="https://i-assets-io-github-taretmch.s3.ap-northeast-1.amazonaws.com/nextbeat-matsuri-2024/IMG_0006.png" />
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  bottom: 50px;
}
img {
  height: 280px;
  margin: auto;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 会場

- 発表、質疑応答時の英語 <-> 日本語の同時通訳があって、英語わからなくても楽しめた
  - レシーバーの配布、マイクの運搬お疲れさまでした...
- 会場が広く、また、座るのが辛くなかった
- ノベルティが豪華だった
- お昼の弁当、コーヒーが美味しかった
- 懇親会 🍺

<div class="image-container">
  <img src="/images/badge.png" />
  <p>素敵な Scala のバッジも</p>
</div>

<style scoped>
.image-container {
  position: absolute;
  right: 50px;
  bottom: 50px;
}
img {
  height: 200px;
  margin: auto;
}
.image-container p {
  text-align: center;
}
</style>

---

# ScalaMatsuri 2024 の感想

### 発表について

- Scala のビルドツール、ライブラリ、エコシステムの進化を学ぶことができた
- Scala 3, scala-cli を使ったものが多かった
- Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい
- opaque, coursier, tapir などの単語の読み方を知ることができた

|  |  |
| --- | --- |
| opaque | オペーク |
| coursier  | クルシェ |
| tapir | タピア |


---

# ScalaMatsuri 2024 の感想

- 両日とも楽しすぎてあっという間に終わった
- 台場、会場が広くて綺麗
- 懇親会での交流も楽しかった。やはり Scala バージョン更新に苦労している方 (会社) が多かった
- 業務アプリケーションを全て Scala 3 にあげたくなった

<div class="image-container">
  <img src="/images/daiba_kirei.png">
  <img src="/images/gohan_oishii.png">
</div>

<style scoped>
.image-container {
  display: flex;
  justify-content: space-around;
  margin-top: 20px;
}
img {
  width: 40%;
}
</style>

---

# ScalaMatsuri 2024 の発表一覧 (Day 1)

- [com.lihaoyi エコシステムによる簡単Scalaプログラミング](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html)
- [Scala to WebAssembly: 動機と方法](https://speakerdeck.com/tanishiking/scala-to-webassembly-exploring-the-how-and-why)
- Project Loom の概要と Scala での有用性
- [Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法](https://github.com/koljamaier/big-data-productivty-booster-scalamatsuri-2024/blob/main/slides/The%20productivity%20booster%20for%20your%20Data%20Projects%20with%20Scala3%20%26%20scala-cli.pdf)
- [record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング](https://speakerdeck.com/tarao/record4s-extensible-records-for-scala-3-and-domain-modeling-with-structural-types)
- [日本語埋め込みモデルを Scala から使うには何が必要か.](https://speakerdeck.com/i10416/scalamatsuri2024-how-to-use-embedding-models-from-scala)
- Ironライブラリで守られた型安全性
- [数値ライブラリで始める安全なプログラミング](https://speakerdeck.com/boykush/introduction-to-safe-programming-with-numeric-library)
- PHPからScalaへ：私の経験
- [Scalaの開発者ツールエコシステム](https://slides.com/tomekgodzik/scala-ecosystem)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# ScalaMatsuri 2024 の発表一覧 (Day 2)

- [Scala ビルド時間の最適化](https://speakerdeck.com/bishabosha/optimising-scala-3-build-times-scala-matsuri)
- [Property-based testing: テストライブラリ活用方法](https://slides.com/magdastozek/property-based-testing-scala-20-min)
- [実務で使えるScala初心者向けTips](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub)
- [作って学ぶ Extensible Effects](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit)
- Ox を用いた Direct-Style Scala
- [いつ継承を使い、いつ使わないのか](https://gakuzzzz.github.io/slides/when_to_use_subtyping_when_not_to_use/#1)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# com.lihaoyi エコシステムによる簡単Scalaプログラミング

### ポイント

- lihaoyi さんによる Scala のライブラリ群の紹介と、その歴史
- <span v-click>Cats, ZIO などのライブラリを使わずに、Scala のコアライブラリだけでエコシステムを築き上げてきた</span>
- <span v-click>Python のようなシンプルな記法で書くことができる</span>
- <span v-click>com.lihaoyi のライブラリを組み合わせることで、様々なアプリケーションを作ることができる</span>
  - <span v-click>[組み合わせの一覧 📝](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html#the-comlihaoyi-platform-has-built-out-a-third-way) (スクショはこのリンクから作成)</span>

<div v-click class="image-container">
  <img src="/images/lihaoyi-cheat-sheet.png" />
</div>

<style scoped>
.image-container {
  margin-top: 20px;
}
img {
  height: 150px;
  margin: auto;
}
</style>

---

# com.lihaoyi エコシステムによる簡単Scalaプログラミング

### 感想

- <span v-click>誕生秘話が聞けて良かった</span>
- <span v-click>2012年〜開発を継続されてきた、そのモチベーションと歴史に感銘を受けた</span>
- <span v-click>Scala にたどり着くまでに PHP, Python, Java, C#, F# 全てで作ったとのこと... すごい</span>
- <span v-click>エコシステムに感謝し、貢献していくために活用していきたい</span>
  - <span v-click>身近なところだと、Scala の研修資料に取り入れやすそう</span>

---

# Scala to WebAssembly: 動機と方法

- Scala で WebAssembly がサポートされる！という話
- Scala -> Scala.js -> Wasm
- WasmGC の話なども

<br>

<div v-click>

### 感想

- Scala でフロントエンドを書けるのはロマンがあって良い
- WebAssembly は未知の領域だが、Scala で書けるのは楽しそうと感じた

</div>

---

# Project Loom の概要と Scala での有用性

- OpenJDK 21 で導入された仮想スレッドの話
- Scala では、Cats Effect, ZIO の Fiber が該当する
- JVM なので Scala でも使える

<br>

<div v-click>

### 感想

- 最新の Java についてキャッチアップすることができ、勉強になった
- JVM で動作する強みを、改めて感じた

</div>

---

# Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法

- Scala CLI x Apache Spark x Apache Kafka x BigQuery でデータ処理を行う話
- <span v-click>Scala 3 の強み</span>
  - <span v-click>Syntax</span><span v-click>, Enums</span><span v-click>, トップレベル定義</span><span v-click>, リリースサイクル</span><span v-click>, Scala CLI</span>
- <span v-click>Scala CLI によって、Spark によるデータ処理を Python のように生産性高く書くことができる</span>
- <span v-click>Scala.js のおかげで、BigQuery のユーザー定義関数を Scala で書くことができる</span>

<br>

### 感想

---

## record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング

<br>

- Scala 3 で導入された[構造的型](https://docs.scala-lang.org/scala3/book/types-structural.html)を利用して、型安全なレコードを定義するライブラリの紹介
- 業務アプリケーションでは、同じようなモデルを使い回すことが多い。管理が煩雑になる問題に対するソリューション
- circe, upickle のような JSON ライブラリとの連携も可能

<br>

### 感想

- Scala 3.5.0 に入っている NamedTuple に似ており、NamedTuple をどのように使えるか record4s で事前に学ぶことができそう

---

## 日本語埋め込みモデルを Scala から使うには何が必要か.

<br>

- 

<br>

### 感想

---

## Ironライブラリで守られた型安全性

<br>

- 

<br>

### 感想

---

## 数値ライブラリで始める安全なプログラミング

<br>

- [typelevel/spire](https://github.com/typelevel/spire) の紹介
- Double、BigDecimal などの数値型を扱うとき、計算途中に丸められて全体の計算精度が落ちることがある
- 途中式に精度を入れず、計算結果の出力に精度を持たせることで、安全な数値計算ができる

---

## 数値ライブラリで始める安全なプログラミング

<br>

### Rational 型

- 有理数の表現

```scala
import spire.math.Rational
import java.math.RoundingMode.HALF_UP

val `1/6` = Rational(1, 6)
println(`1/6`.toBigDecimal(5, HALF_UP))
// 0.16667
```

<br>

### Real 型

- 無理数を算出する「式」を表現する
- 精度を与えると Rational 型に変換できる

```scala
import spire.math.Real
import java.math.RoundingMode.HALF_UP
println(Real(2).sqrt) // 1.4142135623730950488016887242096980785697
println(Real(2).sqrt.toRational(6)) // 45/32
println(Real(2).sqrt.toRational(6).toBigDecimal(5, HALF_UP)) // 1.40625
```

---

## 数値ライブラリで始める安全なプログラミング

<br>

- 他にも Polynomial 型 ($ax + b$ のような一次多項式)、Complex 型などがある
- Rational の JSON シリアライズは文字列にして構造を保持する

<br>

### 会場の雰囲気 | 感想

- 最近話題に上がっていただけあって盛り上がった
- 無理数の表現方法が遅延評価で面白い
- 永続化も文字列で行い構造を保持するのは良いアイデア
- どうしても近似値が欲しいときは近似値を保持するカラムも用意すれば良さそう
- [Inexact](https://github.com/typelevel/spire/blob/v0.18.0/core/src/main/scala/spire/math/Real.scala#L578-L589) : シンプルに表現されている

---

## PHPからScalaへ：私の経験

<br>

- Option 型の null safe
- パターンマッチング
- 中置記法 (infix, 配列のコレクションメソッド)
- implicit の表現力 (Scala 3 だと given, using, extension, Conversion)

<br>

### Scala を始めるためにピッタリのリンク集

- https://github.com/KristianLentino99/ScalaMatsuri2024

<br>

### 会場の雰囲気

- Scala のパターンマッチングは強い
- コレクションメソッドの高階関数は他の言語にも作られてきていて、やはり便利
- 中置記法のような記法は直感的で、コードの可読性が上がる
- Scala やっていると当たり前になっている良さを再確認できた

---

## Scalaの開発者ツールエコシステム

# Scala 基礎に関する発表の振り返り

- PHPからScalaへ：私の経験
- 実務で使えるScala初心者向けTips
- いつ継承を使い、いつ使わないのか

<br>
Scala 未経験者、Scala 始めたての人の指針になる発表で、とても有益なものだった。

ポイント 📝

- PHP から Scala に入ったとき、Option、パターンマッチング、中置記法、implicit などの機能が魅力的だった
- Scala を始めるためにピッタリのリンク集: 
- 実行時エラーを起こすものは避ける、コレクション型の操作は高階関数を使おう、for 糖衣構文を使おうなどなど... [slide](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub?slide=id.p37)
- 代数的データ型と Subtyping (継承) の使い分けは、モデルの構造と操作に着目するとわかりやすい (スライド見るのが一番)

<!--
文字だけだと退屈するが、参考コードを貼るか悩ましい...
本音は元スライド見に行ってもらいたいので、ポイントだけ列挙する形のままでいいかも
-->

---

# Scala 応用、JVM に関する発表の振り返り

- Scala to WebAssembly: 動機と方法
- Project Loom の概要と Scala での有用性
- Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法
- 日本語埋め込みモデルを Scala から使うには何が必要か.
- 作って学ぶ Extensible Effects

<br>
Scala.js、WebAssembly、グリーンスレッド、Apache Spark x Apache Kafka x BigQuery によるデータ処理、日本語埋め込みモデルを Scala で自然言語処理する方法、Effect System の概念、と難しい話題が多かったが、普段馴染みのないものだったので良い刺激になった。

<!--
これもここでは感想だけにして、スライド見に行ってもらうのが良さそう
-->

---

# ツール、コンパイラに関する発表の振り返り

- Scalaの開発者ツールエコシステム
- Scala ビルド時間の最適化

<br>
Scalameta、Scala コンパイラのコントリビューターの方々の発表。

ポイント

- コンパイルのレイヤー (e.g. sbt -> zinc -> scalac) 、コンパイルフェーズの紹介
- 適切にプロジェクトを分割し (1プロジェクト20ファイルくらい) 依存関係を綺麗にすれば、並行ビルドによりビルド時間を短縮できる
- パイプラインビルド (Scala 3.5.0) によるビルド時間の短縮

<!--
感想だけでいいかな
-->

---

# ライブラリに関する発表の振り返り

- com.lihaoyi エコシステムによる簡単Scalaプログラミング
- record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング
- Ironライブラリで守られた型安全性
- 数値ライブラリで始める安全なプログラミング
- Property-based testing: テストライブラリ活用方法
- Ox を用いた Direct-Style Scala

<!--
業務アプリケーションに入れて試してみるので、1つ1つ丁寧に感想を書く
-->

## record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング

- Scala 3 で導入された[構造的型](https://docs.scala-lang.org/scala3/book/types-structural.html)を利用して、型安全なレコードを定義するライブラリの紹介。
- 業務アプリケーションでは、同じようなモデルを使い回すことが多い。管理が煩雑になる問題に対するソリューション。
- circe, upickle のような JSON ライブラリとの連携も可能
- Scala 3.5.0 に入っている NamedTuple に似ており、NamedTuple をどのように使えるか record4s で事前に学ぶことができそう。

<!--
tapir との連携を後で紹介するので、circe, upickle と連携できること、ライブラリのメリットについて紹介する
-->

---

## Ironライブラリで守られた型安全性

- Scala 3 で Refinement Types を使って型に制約を持たせるためのライブラリ
- 以下のブログが参考になる: https://blog.3qe.us/entry/2024/02/19/040745

<!--
良さげな Constraint を紹介するとか？
-->

## 数値ライブラリで始める安全なプログラミング

- typelevel/spire
- 特に料金計算、請求のドメインに有用なデータ型が紹介された
- Rational 型、Real 型、Polynomial 型など

---

## Property-based testing: テストライブラリ活用方法

- プロパティベースのテスト
- 満たすべき性質を定義し、テストを自動生成する
- Scala のライブラリは Scalacheck
- プロパティを定義するには深いドメイン知識と一定のコツが必要
- 例を使ったテストとの使い分けが重要
- 重要なコンポーネントに対してはプロパティベースのテストを使うと良い

## Ox を用いた Direct-Style Scala

- 手続き的な記法で並行プログラミングを行うためのライブラリ
- Go の goroutine のような記法で書ける
- Scala 未経験者の方でも直感的に書くことができるのでは

---

# record4s 使ってみた

- Scala 3.3.3 x tapir x http4s で構築している (ちっちゃな) プロダクトに record4s を導入してみた
  - request/response の型定義を record4s で定義し、保守するコード量を減らせるか検証

---

# エンドポイントの紹介

- もちろんサンプルのエンドポイント
- GET, POST, PUT エンドポイントで利用するデータ型を Record で表現
- case class での定義との比較
- Schema Derivation の定義
- 生成される OpenAPI 仕様書と、クライアントで自動生成する API クライアントのインタフェース

---

# record4s を触ってみて

- request/response の case class 作成の手間がなくなった
- JSON の Schema インスタンスが共通化されコード量が減った (結構嬉しい)
- ドメインモデル→response へのデータの詰め替えはそこまで変わりない
- NamedTuple がとても便利そう
- パイプラインビルドもあるので、早く 3.5.0 にアップデートしたい

---

# まとめ

- Scala のビルドツール、ライブラリ、エコシステムは日々進化している。その進化を実感できる場として ScalaMatsuri は最適
- 今年は、Scala の基礎から応用、コンパイラ、ライブラリまで幅広いトピックが取り上げられた
- 2019年以来のオフライン開催で、会場の雰囲気、熱気は最高だった
- record4s で request/response の型定義を行うことで、コード量を減らすことができた
- Scala 3 は生産性が高い、書いていて楽しい、Scala 2 よりも理解しやすい。もっと流行らせたい

<!--
まとめに書くことはどこかのスライドにも書いておく。そうじゃないとまとめじゃないので。
-->
