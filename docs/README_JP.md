# トレジャーメイズソルバー

[RU](/README.md) | [EN](README_EN.md) | [FR](README_FR.md) |  [JP](README_JP.md) | [DE](README_DE.md) | [CH](README_CH.md) | [KR](README_KR.md)

このリポジトリには、"トレジャーメイズ"問題を解決するアルゴリズムが含まれています。各セルが空（0）、含まれる壁（1）、または含まれる宝（S）で表される2D配列として表される迷路が与えられた場合、目標はすべての宝を集めて出口に到達することです。

## 問題の説明

迷路の地図が提供されます：
- 0は空のセルを示します。
- 1は壁を示します。
- Sは宝を示します。

迷路の入り口は左上（0,0）にあり、出口は右下（N-1、M-1）にあります。

## タスク

1. すべての宝を集めて出口に到達する最短経路を見つけるアルゴリズムを開発します。
2. アルゴリズムの時間複雑度を決定します。
3. （オプション）アルゴリズムを変更して、迷路を文字列として返すようにします。たとえば、「RRDDLU」（R = 右、D = 下、L = 左、U = 上）です。

## 例

次の迷路を考えます：

[
[0, S, 1, 0],
[0, 0, 1, S],
[1, 0, 0, 0],
[0, 1, S, 0]
]


## 使用法

リポジトリをクローンし、`src`フォルダ内の`TreasureMaze.java`ファイルを迷路データとして入力して実行します。

# ライセンス

このプロジェクトはMITライセンスのもとでライセンスが付与されています - 詳細については[LICENSE](/LICENSE)ファイルを参照してください。
