---
theme: default
title: ScalaMatsuri 2024 の発表振り返りと実務への応用について
class: text-center
highlighter: shiki
drawings:
  persist: false
transition: (slide)-left
mdc: true
---

## ScalaMatsuri 2024 の発表振り返りと実務への応用について

<!--
タイトル悩ましい。
実務への応用はあんまないかも...
純粋に Scala を楽しめた会だったので、その楽しさを伝えられた方が良い
-->

---

# 自己紹介

- ScalaMatsuri には2021年から参加 (2023年、2024年にオフライン参加 🏮)
- Scala は実務で触り始めて5年目
- Platform チームで、社内の共通ライブラリ (Scala, TypeScript, Capacitor) の開発や認証基盤の開発を担当

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

<!--
- ここに発表の一覧のスクショを貼る。元リンクも忘れずに
- どの発表が印象に残ったか、、などを簡単にコメント
- 会場の雰囲気がわかる写真があれば
-->

---

# ScalaMatsuri 2024 の感想

- 昨年もオフライン参加したがハイブリッドだったので、雰囲気が全く違った
- 両日とも楽しすぎてあっという間に終わった
- Scala 好きの人が集まっていて、会場の雰囲気がよかった
- グローバル！
- 英語<->日本語の同時通訳があり、大変助かりました...英語得意になりたい
- お昼の弁当、コーヒーが美味しかった
- 台場、会場が広くて綺麗
- 懇親会での交流も楽しかった。やはり Scala バージョン更新に苦労している方 (会社) が多かった
- 発表は Scala 3 のものばかりで、業務アプリケーションを全て Scala 3 にあげたくなった
- opaque, coursier, tapir などの単語の読み方を知ることができた

<!-- 
あとでちゃんと書く
-->

---

# ScalaMatsuri 2024 の発表一覧 (Day 1)

- [com.lihaoyi エコシステムによる簡単Scalaプログラミング](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html)
- [Scala to WebAssembly: 動機と方法](https://speakerdeck.com/tanishiking/scala-to-webassembly-exploring-the-how-and-why)
- Project Loom の概要と Scala での有用性
- Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法
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

- Scala ビルド時間の最適化
- [Property-based testing: テストライブラリ活用方法](https://slides.com/magdastozek/property-based-testing-scala-20-min)
- [実務で使えるScala初心者向けTips](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub)
- [作って学ぶ Extensible Effects](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit)
- Ox を用いた Direct-Style Scala
- [いつ継承を使い、いつ使わないのか](https://gakuzzzz.github.io/slides/when_to_use_subtyping_when_not_to_use/#1)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

## com.lihaoyi エコシステムによる簡単Scalaプログラミング

<br>

- lihaoyi さんによる Scala のライブラリ群の紹介と、その歴史
- Scalatags, FastParse, uTest, uPickle, Ammonite, Sourcecode, Mill, PPrint, OS-Lib, Requests-Scala, Cask, MainArgs, ScalaSql
- Cats, ZIO などのライブラリを使わずに、Scala のコアライブラリだけでエコシステムを築き上げてきた
- Python のようなシンプルな記法で書くことができる
- com.lihaoyi のライブラリを組み合わせることで、様々なアプリケーションを作ることができる
  - [組み合わせの一覧 📝](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html#the-comlihaoyi-platform-has-built-out-a-third-way)

---

## com.lihaoyi エコシステムによる簡単Scalaプログラミング

<br>

### 感想

- 誕生秘話が聞けて良かった
- Scala にたどり着くまでに PHP, Python, Java, C#, F# 全てで作ったとのこと... すごい
- 2012年〜開発を継続されてきた、そのモチベーションと歴史に感銘を受けた
- エコシステムに感謝し、貢献していくために活用していきたい
- 身近なところだと、Scala の研修資料に取り入れやすそう
- レシーバーもらい忘れて質疑応答の内容が聞き取れなかった... 😭

---

## Scala to WebAssembly: 動機と方法

<br>

- Scala で WebAssembly がサポートされる！という話
- Scala -> Scala.js -> Wasm
- WasmGC の話なども

<br>

### 感想

- Scala でフロントエンドを書けるのはロマン
- 今後のトレンドにもなっていきそうなので、キャッチアップしていきたい

---

## Project Loom の概要と Scala での有用性

<br>

- OpenJDK 21 で導入される仮想スレッドの話
- Cats Effect, ZIO の Fiber のこと

<br>

### 感想

---

## Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法

<br>

- 

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
