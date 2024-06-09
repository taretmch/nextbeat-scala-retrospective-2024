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

<!-- 
あとでちゃんと書く
-->

---

# ScalaMatsuri 2024 の発表一覧 (Day 1)

- [com.lihaoyi エコシステムによる簡単Scalaプログラミング](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_01) [(slide)](https://www.lihaoyi.com/post/12yearsofthecomlihaoyiScalaPlatform.html)
- [Scala to WebAssembly: 動機と方法](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_02) [(slide)](https://speakerdeck.com/tanishiking/scala-to-webassembly-exploring-the-how-and-why)
- [Project Loom の概要と Scala での有用性](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_03)
- [Scala3とscala-cliでデータプロジェクトの生産性を向上させる方法](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_04)
- [record4s --- Scala 3のための拡張可能レコード、そして構造的型によるドメインモデリング](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_05) [(slide)](https://speakerdeck.com/tarao/record4s-extensible-records-for-scala-3-and-domain-modeling-with-structural-types)
- [日本語埋め込みモデルを Scala から使うには何が必要か.](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_06) [(slide)](https://speakerdeck.com/i10416/scalamatsuri2024-how-to-use-embedding-models-from-scala)
- [Ironライブラリで守られた型安全性](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_07)
- [数値ライブラリで始める安全なプログラミング](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_08) [(slide)](https://speakerdeck.com/boykush/introduction-to-safe-programming-with-numeric-library)
- [PHPからScalaへ：私の経験](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_09)
- [Scalaの開発者ツールエコシステム](https://scalamatsuri.org/ja/programs/SESSION_DAY_1_10) [(slide)](https://slides.com/tomekgodzik/scala-ecosystem)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# ScalaMatsuri 2024 の発表一覧 (Day 2)

- [Scala ビルド時間の最適化](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_01)
- [Property-based testing: テストライブラリ活用方法](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_02) [(slide)](https://slides.com/magdastozek/property-based-testing-scala-20-min)
- [実務で使えるScala初心者向けTips](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_03) [(slide)](https://docs.google.com/presentation/d/e/2PACX-1vSP9jbfKrRj0K4TaSCFfZGsfuufvYXI2Wx2MqVI7eHhagXstuBt0DjSF2sp6bncSA/pub)
- [作って学ぶ Extensible Effects](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_04) [(slide)](https://docs.google.com/presentation/d/1raybiE8Otk2nreKDyRHoF1HK50K9K-fjL8-37QK8kW4/edit)
- [Ox を用いた Direct-Style Scala](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_05)
- [いつ継承を使い、いつ使わないのか](https://scalamatsuri.org/ja/programs/SESSION_DAY_2_06) [(slide)](https://gakuzzzz.github.io/slides/when_to_use_subtyping_when_not_to_use/#1)

<!--
飛び込みカンファレンスについても口頭で紹介する
-->

---

# Scala 基礎に関する発表の振り返り

- PHPからScalaへ：私の経験
- 実務で使えるScala初心者向けTips
- いつ継承を使い、いつ使わないのか

<br>
Scala 未経験者、Scala 始めたての人の指針になる発表で、とても有益なものだった。

ポイント 📝

- PHP から Scala に入ったとき、Option、パターンマッチング、中置記法、implicit などの機能が魅力的だった
- Scala を始めるためにピッタリのリンク集: https://github.com/KristianLentino99/ScalaMatsuri2024
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

---

## com.lihaoyi エコシステムによる簡単Scalaプログラミング

- lihaoyi さんが Scala のコアライブラリだけでエコシステムを築き上げてきた、その歴史やモチベーションに感銘を受けた。
- Python ライブラリのような記述で、Scala 未経験者が触り始めるライブラリとして最適だと感じた。
- 弊社でも、研修内容に取り込むなどエコシステムを活用することにより、貢献していきたい。

<!--
Hands on のリンクを貼っても良いかも
https://www.handsonscala.com/
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
