(ns clj-cn-parser.normalize
  "This module do some pre-processing work to normalize the irregular use
in Chinese language to do better segmentation and for later analysis."
  (require [clojure.string :as s]))

(def f->h-table
  {"　" " ", "！" "!", "＂" "\"", "＃" "#", "＄" "$", "％" "%",
   "＆" "&", "＇" "'", "（" "(", "）" ")", "＊" "*", "＋" "+",
   "，" ",", "－" "-", "．" ".", "／" "/", "０" "0", "１" "1",
   "２" "2", "３" "3", "４" "4", "５" "5", "６" "6", "７" "7",
   "８" "8", "９" "9", "：" ":", "；" ";", "＜" "<", "＝" "=",
   "＞" ">", "？" "?", "＠" "@", "Ａ" "A", "Ｂ" "B", "Ｃ" "C",
   "Ｄ" "D", "Ｅ" "E", "Ｆ" "F", "Ｇ" "G", "Ｈ" "H", "Ｉ" "I",
   "Ｊ" "J", "Ｋ" "K", "Ｌ" "L", "Ｍ" "M", "Ｎ" "N", "Ｏ" "O",
   "Ｐ" "P", "Ｑ" "Q", "Ｒ" "R", "Ｓ" "S", "Ｔ" "T", "Ｕ" "U",
   "Ｖ" "V", "Ｗ" "W", "Ｘ" "X", "Ｙ" "Y", "Ｚ" "Z", "［" "[",
   "＼" "\\", "］" "]", "＾" "^", "＿" "_", "｀" "`", "ａ" "a",
   "ｂ", "b", "ｃ" "c", "ｄ" "d", "ｅ" "e", "ｆ" "f", "ｇ" "g",
   "ｈ" "h", "ｉ" "i", "ｊ" "j", "ｋ" "k", "ｌ" "l", "ｍ" "m",
   "ｎ" "n", "ｏ" "o", "ｐ" "p", "ｑ" "q", "ｒ" "r", "ｓ" "s",
   "ｔ" "t", "ｕ" "u", "ｖ" "v", "ｗ" "w", "ｘ" "x", "ｙ" "y"
   "ｚ" "z", "｛" "{", "｜" "|", "｝" "}", "～" "~"})

(defn fullwidth->halfwidth
  "Change full with character to their half width counterpart."
  [s]
  (apply str (map #(get f->h-table (str %) %) s)))
