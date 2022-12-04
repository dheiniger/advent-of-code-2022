(ns day-2.core)

(def input
  '(B Z
      A X
      C X
      C X
      C Z
      C X
      C X
      A Z
      C X
      B Z
      B Z
      C X
      A X
      C X
      C X
      C X
      C Y
      C X
      C Z
      C X
      C X
      C X
      C X
      C X
      C Z
      C X
      C X
      A X
      C X
      B Y
      A X
      B X
      A Z
      C X
      B Y
      A X
      C Z
      C X
      C Z
      A X
      A Y
      B Z
      A Z
      C X
      A Z
      A Z
      A Y
      C Y
      A Y
      A Z
      C X
      A Y
      B Y
      A Z
      B Y
      C Z
      A X
      C X
      C Z
      B Z
      C X
      B Y
      C X
      A Z
      C X
      A X
      C X
      C X
      A Z
      B Z
      C X
      C X
      C Z
      C X
      B X
      C X
      A Z
      A X
      A Y
      A Y
      A Z
      C X
      C Z
      C X
      B Y
      C X
      C X
      A X
      A X
      C Z
      C X
      B X
      C Z
      C X
      C X
      C X
      B Z
      B Y
      A Z
      C X
      A Z
      C X
      C Z
      A Z
      C X
      A X
      C X
      C Z
      C Z
      C X
      C Z
      A Y
      C X
      A X
      A Z
      A X
      C Y
      B X
      C X
      A X
      A Y
      A X
      B Y
      A X
      C X
      B Y
      A Z
      C X
      B X
      C X
      A Y
      C Z
      C X
      C Z
      C X
      A Y
      A Z
      C X
      A Z
      B Y
      C X
      A Z
      C X
      C Z
      B Z
      C X
      C Z
      C X
      C Z
      C X
      A Y
      C X
      C X
      A Z
      C Z
      C X
      A X
      C X
      C X
      B Y
      C X
      C X
      C X
      C X
      C X
      A Y
      C Z
      C X
      C X
      C Z
      B X
      C X
      C X
      C Z
      B Y
      B Y
      C X
      C X
      A Z
      C Z
      C X
      C Z
      C X
      A Y
      A X
      A X
      A Y
      C X
      C X
      C X
      A Z
      B Z
      C Z
      A Y
      A Y
      C X
      C X
      B Y
      C X
      C X
      C X
      A Z
      B Y
      B Y
      C X
      C Y
      C X
      C Z
      B Y
      C X
      C X
      C Z
      A X
      B Y
      C X
      A Z
      C X
      A Z
      C X
      A Z
      C X
      C Z
      C X
      A Z
      C X
      A X
      C Z
      A Z
      A Y
      C X
      C Z
      B Y
      A Z
      C X
      B Y
      B X
      A Z
      C X
      C Y
      A X
      C Z
      A X
      C Z
      C Z
      C Z
      A Z
      C X
      C X
      A Z
      C X
      A X
      C X
      B X
      C X
      C X
      C Z
      C X
      C X
      C Z
      C X
      A Y
      C Z
      C Z
      A X
      A Z
      B X
      C X
      C X
      B X
      C Y
      C X
      A Y
      C Z
      A X
      C X
      A Y
      A Z
      C X
      A Y
      A Z
      A Z
      C Z
      C X
      A Y
      C X
      A X
      C X
      C X
      C X
      A Z
      C X
      C X
      A Z
      A X
      C X
      B Y
      B X
      C X
      C X
      A Y
      A Z
      B Z
      C Z
      A Z
      A X
      C Z
      A X
      C X
      B X
      C X
      B X
      C X
      A X
      C Z
      C X
      A Z
      A Y
      C X
      C Z
      C X
      A X
      C X
      B Y
      A Z
      C X
      C Z
      A X
      C X
      A Z
      C X
      B Y
      C X
      C Y
      C Y
      B Z
      C Z
      A X
      B Z
      C X
      C X
      A Z
      A X
      C X
      A X
      B Z
      A Z
      B Y
      B Y
      C X
      C X
      A Z
      A Z
      B Z
      A Z
      A Z
      A Z
      B Y
      C Z
      A Y
      A X
      C X
      C X
      C X
      C X
      C Z
      B Y
      C X
      A Z
      B Y
      B Y
      C X
      C X
      A X
      C X
      C Z
      C X
      A X
      A Z
      C Z
      C Z
      B Z
      B Y
      C Z
      C Z
      A X
      B Y
      C X
      C Z
      B Y
      C X
      C X
      C X
      C X
      B Z
      C X
      B X
      C Y
      C Z
      A Z
      C X
      C X
      C X
      A Z
      C X
      B Z
      C Z
      C Z
      C X
      C Z
      A Z
      C X
      C X
      C X
      C Z
      C Z
      C X
      C X
      C Z
      C X
      C Z
      C X
      A Z
      C X
      B Z
      B X
      B Z
      A Z
      A Z
      B Y
      C Y
      C X
      C X
      C X
      C X
      A X
      C X
      A X
      C X
      C X
      A Z
      C X
      C X
      B Y
      C Z
      C X
      C X
      A Y
      A X
      C Z
      C Z
      C X
      C X
      C X
      B X
      C Z
      C X
      C X
      C X
      B X
      A Y
      B Z
      C X
      B Y
      C X
      C X
      C X
      B X
      B Y
      A Z
      A Z
      A Z
      C X
      A Z
      C Z
      B Z
      C X
      A Z
      C X
      C X
      C X
      A Y
      B Y
      C X
      B Y
      C Z
      C X
      B X
      A Z
      C X
      A X
      C X
      C Z
      C Z
      B Y
      C Z
      C X
      C X
      B X
      C X
      C X
      C X
      C X
      A Z
      B Y
      A X
      C X
      A Y
      B X
      A Z
      A Z
      C X
      A Y
      C Z
      A Z
      A X
      A Y
      C X
      C Z
      C Z
      C Z
      C X
      B Y
      C X
      A Y
      C X
      A Z
      C X
      C Z
      C X
      B X
      C Z
      C Y
      C X
      B Z
      A X
      B X
      C X
      B Y
      C Z
      C Z
      C Z
      C X
      A Z
      C Z
      C X
      C X
      C X
      B Z
      C X
      C X
      A Z
      C X
      A Z
      C Z
      A Z
      A Z
      A Z
      C X
      A X
      C X
      A Z
      A Y
      C X
      A Z
      C X
      B Y
      A X
      C Z
      A Z
      C Z
      A Y
      C X
      A Z
      C Z
      C X
      C X
      C X
      C Y
      C X
      A Y
      A Z
      A X
      C Z
      C Z
      A Y
      C X
      C X
      B Y
      B Z
      C X
      B Y
      C Z
      C Z
      C X
      C Z
      B Y
      C Z
      B Y
      C Z
      B Y
      C X
      A X
      A X
      C X
      A Z
      A Z
      C X
      C X
      B Y
      A Z
      C Z
      A X
      C Z
      C X
      C Y
      A Z
      A Z
      C X
      C X
      A X
      C X
      C Z
      C X
      B Z
      C X
      A Z
      A Z
      C X
      A Z
      A X
      A Z
      C Y
      B Y
      C X
      C X
      C Z
      C Z
      C Z
      C Z
      C X
      A X
      C X
      B Y
      C X
      B Y
      B Y
      B X
      C X
      C X
      C X
      C X
      C X
      C Z
      A X
      C X
      C X
      A Z
      A Z
      C X
      A Z
      C X
      C Z
      C X
      B Z
      A Z
      C X
      C X
      C X
      C Z
      A Z
      B Y
      C X
      C X
      C Z
      C X
      C X
      C X
      A Z
      B Z
      A X
      C Z
      C X
      C X
      A X
      C X
      C X
      C X
      A Z
      A Y
      C Y
      C Z
      C X
      C Z
      C Z
      A Z
      C X
      C X
      B X
      C Z
      A Y
      C X
      C X
      C X
      C Z
      C X
      C Z
      C X
      C X
      C X
      B X
      C X
      A Z
      B X
      B Y
      C X
      A Z
      A Z
      C X
      A Y
      C X
      C Z
      A Z
      B Z
      A Z
      B Y
      A X
      A Y
      B X
      C X
      B Z
      C Z
      B Y
      C X
      A Z
      C Z
      C Z
      C Z
      B X
      C X
      A X
      B Y
      C X
      C X
      A X
      B Z
      B X
      C X
      C X
      A X
      C X
      C X
      C X
      C X
      C Z
      C X
      A Z
      B Y
      A Y
      B Y
      A X
      C X
      A Y
      A Z
      C X
      C X
      B Y
      C X
      B Y
      C Z
      C X
      C X
      B Y
      C X
      A Z
      C Z
      C X
      C X
      C Z
      C X
      C X
      B Y
      B Y
      C X
      C X
      C X
      C X
      C X
      A Z
      C X
      C X
      B Z
      B Y
      A Z
      C X
      C X
      C X
      A Y
      C X
      A Y
      A X
      A Z
      B X
      C X
      A X
      B X
      A Z
      C Z
      C X
      A Z
      A X
      C X
      C X
      C X
      C X
      B Z
      A X
      A X
      C Z
      C X
      C X
      A Y
      C Z
      C X
      B Y
      C X
      B Y
      C X
      C X
      B X
      C X
      A Z
      C Z
      C X
      C X
      C X
      C X
      A Z
      A Y
      C Z
      C X
      B X
      A Y
      A X
      A X
      B X
      C X
      C X
      A X
      C X
      C Z
      A X
      C Z
      C X
      B Y
      C X
      C X
      C Z
      C X
      B Z
      C X
      C X
      C Z
      B Z
      C X
      C Z
      A Z
      C X
      B X
      C X
      C X
      C X
      C X
      C X
      C X
      A Z
      A Z
      B Z
      A Y
      A Z
      B X
      A Y
      B Y
      C X
      C X
      C Z
      C X
      C X
      C X
      A Y
      C X
      C X
      B X
      C Z
      C X
      C X
      C X
      C X
      B Y
      A Y
      C X
      A Z
      C X
      C X
      C Z
      C X
      C Z
      C X
      C X
      B Y
      A Z
      B X
      A X
      C X
      C Z
      C X
      C X
      C X
      C X
      C X
      B Z
      C X
      C X
      C Z
      B Y
      C X
      B Y
      C X
      C X
      C X
      C X
      C Z
      C X
      A Y
      C X
      C Z
      A Y
      A X
      B Z
      C Z
      C X
      A X
      C X
      A Y
      C X
      C X
      B X
      C X
      B X
      B Z
      A Z
      A X
      C X
      A Z
      C X
      C X
      C X
      C X
      A Y
      C Y
      A X
      C Z
      A Y
      C X
      A Z
      C X
      C X
      C X
      A Y
      C X
      C X
      C X
      C X
      A X
      C X
      A Z
      A Z
      A X
      A Z
      C Z
      C X
      B Y
      A Y
      C X
      C X
      C X
      C X
      A Z
      C X
      A Z
      B X
      B Y
      C X
      A Z
      A X
      C X
      C Z
      C X
      C X
      C Z
      C X
      C Z
      B X
      C X
      C X
      C X
      A X
      A Z
      C Z
      C Y
      C X
      A Y
      B Y
      C X
      B Y
      C X
      C X
      C X
      A Z
      C X
      B Z
      A Y
      C X
      C X
      B Y
      A X
      C Z
      C X
      B Y
      C Z
      A Y
      B Y
      B Z
      C X
      C X
      A Z
      C X
      C Z
      C Y
      A X
      B Y
      C Y
      A X
      C Z
      C Y
      C X
      A Y
      B Z
      C X
      A Z
      C X
      B Y
      C X
      C Y
      C X
      C Z
      C X
      A Z
      C Z
      C X
      C X
      C X
      B X
      A Z
      C X
      C X
      C Z
      C Y
      C Z
      C X
      C X
      C Z
      A X
      C Z
      C Y
      B Y
      C X
      B Y
      C Z
      C X
      C X
      C X
      A X
      B X
      C X
      B Z
      A Y
      C X
      C Z
      B Y
      C X
      C X
      C X
      C Z
      C X
      C X
      C X
      C X
      A Y
      C X
      B X
      C Y
      A X
      B Y
      A Z
      C X
      C X
      A Z
      C Z
      C X
      C Z
      A Y
      A X
      C Z
      A Z
      C Y
      A Z
      B Y
      C X
      A Z
      C X
      C Z
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C Z
      B X
      A Y
      C X
      C X
      C Z
      A Y
      A Z
      A Z
      B Y
      C X
      C Z
      C X
      C Z
      C X
      C X
      C X
      C X
      A Z
      A X
      A Z
      C X
      A Y
      B Y
      C X
      C Y
      A Z
      B X
      C Z
      A X
      C X
      C X
      C X
      C X
      C X
      A Y
      A Z
      C X
      C X
      A X
      C Z
      A Z
      A X
      C X
      B Y
      A X
      C Z
      B Y
      C X
      A Z
      B Z
      C X
      C Z
      C Z
      B X
      B Y
      C Z
      A X
      C Z
      C Z
      A Y
      A Y
      C X
      C X
      C X
      C X
      A Y
      C X
      A Z
      C X
      C X
      C X
      C X
      C X
      B Y
      C Z
      C X
      C X
      C Z
      C X
      C X
      B Z
      C X
      A Z
      A Z
      C X
      A X
      C X
      C X
      B Z
      C X
      A Z
      C X
      B X
      C X
      C Z
      C X
      A X
      C X
      B Y
      A X
      C Z
      C Z
      C X
      C X
      C Z
      C X
      C X
      C X
      A Z
      A X
      C X
      B X
      C Z
      A Z
      C Z
      B Z
      C X
      A X
      C X
      C X
      C Z
      C X
      A Y
      A Y
      C Z
      C X
      B Y
      B Z
      C X
      B X
      C X
      C X
      A Z
      C Z
      C Z
      C X
      B X
      A Z
      C X
      C Z
      A X
      C Z
      C Z
      A Z
      A Y
      A Z
      C X
      C X
      C X
      A Z
      A Y
      C X
      A Z
      B Z
      C X
      B X
      B X
      C Z
      C Z
      C Z
      C X
      C X
      C X
      A Z
      C X
      C X
      C X
      C X
      A Z
      C X
      C Y
      A X
      C X
      C X
      B Y
      C X
      C X
      A X
      C Z
      C Z
      C Z
      A Z
      C X
      C X
      C X
      A Y
      C Z
      C X
      C X
      C X
      C Y
      C Z
      C X
      C X
      C X
      C X
      A Z
      C X
      C X
      A X
      C X
      A X
      C X
      C X
      A Z
      C X
      C X
      A Y
      C Z
      A X
      A Y
      C X
      A Z
      B Y
      B Y
      A X
      C Z
      C X
      C X
      C X
      A X
      A Z
      B Y
      C X
      A Y
      C X
      C X
      B Y
      C X
      C X
      C X
      B Y
      C X
      C Z
      C X
      C Z
      A Y
      B Y
      C X
      C Z
      C X
      B X
      A Z
      C Z
      C Z
      C Z
      C X
      B Z
      C X
      B X
      C Y
      C Z
      C X
      C X
      C Z
      A Z
      B X
      C X
      C X
      A Z
      C X
      A Z
      C X
      A Y
      C X
      C Z
      A Z
      A X
      C X
      B X
      C X
      C X
      C X
      C Y
      B X
      C X
      B Y
      C X
      C Y
      A Z
      A Y
      C X
      A Z
      C Z
      A Y
      B Y
      C Z
      A X
      A X
      B X
      C X
      C X
      C Z
      A X
      B Y
      A X
      C Z
      C X
      C X
      C X
      A X
      C X
      C X
      C X
      C Y
      C X
      C X
      C Z
      C X
      C X
      C X
      A Z
      B X
      A Z
      C X
      A X
      C X
      B Y
      B Z
      C X
      C X
      A Z
      C X
      A Y
      B X
      C X
      C X
      C Z
      B Y
      C X
      A Y
      C X
      B Z
      C X
      A Z
      C Z
      C X
      C X
      C X
      C Z
      A X
      B X
      C Z
      B Y
      C Z
      C X
      B Y
      A Z
      C X
      C X
      C X
      C X
      C Z
      A X
      A Y
      A Z
      C X
      C X
      B Y
      B Y
      C X
      A X
      B Y
      A Y
      C X
      C X
      C X
      A X
      B X
      B Y
      A Z
      C X
      C X
      C Z
      A X
      C X
      A X
      A Z
      C X
      A Z
      C X
      C Z
      C Z
      B Z
      C X
      B Y
      C Z
      C X
      A Z
      C X
      C X
      C X
      C X
      C X
      C Y
      C X
      C X
      A Z
      C X
      A X
      A Y
      B Y
      C X
      A Y
      B X
      C Z
      C X
      A Z
      C X
      C X
      C X
      A Z
      B Z
      C Z
      B Z
      C X
      C X
      C Y
      C Z
      C X
      C Z
      C X
      C X
      C X
      B X
      C X
      C X
      A Z
      B Y
      C Z
      C Z
      C X
      A Z
      B Y
      A X
      C X
      A Z
      C Z
      C X
      C X
      A Z
      A X
      C Y
      B Z
      A X
      C X
      A Z
      C X
      C Z
      A Z
      C X
      A Y
      C X
      C X
      B Z
      C X
      C Z
      A Z
      A Z
      C X
      B Z
      B X
      A Z
      A X
      C X
      C X
      C X
      C Z
      C X
      A X
      C X
      C X
      B X
      C Z
      C X
      C X
      C Y
      A Z
      B Y
      A Z
      B Y
      C X
      A Z
      C Z
      C Y
      B Z
      A X
      C X
      C X
      A Y
      B Y
      A X
      C Z
      A Z
      C X
      C X
      B Y
      B Y
      C X
      C X
      C X
      C X
      C X
      C Z
      A X
      A X
      A X
      C Z
      C X
      A X
      C Z
      B Z
      C Z
      C X
      A X
      A Y
      C X
      A Z
      C X
      C X
      C Z
      C Z
      C X
      A X
      A X
      C Y
      A Y
      C X
      C Z
      A X
      A Y
      A Z
      B Y
      C X
      B Y
      A Z
      B X
      C X
      C Z
      C X
      B Z
      A Z
      A Z
      C Z
      C X
      C X
      C Y
      C X
      B X
      C X
      C Z
      A X
      C Y
      A Z
      C X
      C X
      A Z
      A Z
      A Z
      C Z
      A Z
      C X
      B X
      B Y
      C X
      A Z
      C Z
      C X
      C X
      C X
      A X
      B Y
      A Z
      B Y
      C X
      B Z
      A Z
      C Z
      C Z
      C X
      C X
      C X
      A Z
      C X
      A X
      C Z
      A Y
      C X
      A Y
      C X
      C Z
      C X
      C X
      C X
      B Y
      C X
      B Y
      C Z
      B Y
      B Z
      A Z
      A X
      C Z
      C X
      C X
      B Y
      B Y
      A Z
      C X
      C Z
      C Z
      C Z
      B Z
      B Y
      B X
      C X
      C X
      C X
      C Z
      C X
      C X
      B Y
      C X
      C X
      B Y
      C X
      C X
      C X
      C X
      A Y
      C X
      C X
      A Z
      C Z
      A Z
      A Z
      A Y
      A Z
      C Z
      C X
      C X
      C X
      C X
      B Y
      A Z
      C X
      C X
      B Y
      A Y
      A Z
      A Z
      C Z
      C X
      C Y
      C X
      C X
      B Y
      C X
      A X
      B X
      B Y
      C Z
      A X
      C X
      C X
      A X
      C X
      A Y
      A Y
      C X
      C X
      B Y
      C X
      A Z
      C Z
      A X
      C X
      A Z
      C X
      C X
      C X
      C Z
      A Z
      B X
      C X
      A Z
      C Z
      B Y
      C X
      C X
      B X
      C X
      C X
      A Y
      B Z
      B Y
      C X
      C X
      C X
      C Z
      C X
      C X
      C X
      B Y
      C X
      C Z
      C X
      A Z
      B Y
      A X
      B Y
      A Z
      C X
      C X
      A Z
      B Y
      C X
      A Z
      C X
      A Z
      A Z
      B Z
      A Y
      A Z
      C X
      C Z
      C X
      A X
      C X
      B Y
      B X
      C Z
      C X
      B Y
      C Z
      C X
      B Y
      C X
      C Y
      C Z
      A X
      B Z
      C X
      C X
      C Z
      A Z
      C X
      C Z
      A Z
      C X
      C X
      C Z
      C Z
      B Y
      A Z
      C X
      B X
      B Y
      C X
      C X
      C X
      C X
      B Z
      A Z
      C X
      A Z
      A X
      A Z
      C X
      A X
      C Z
      A Z
      C Z
      B Z
      B Y
      C X
      A X
      C Z
      C Z
      A Y
      B X
      C X
      C X
      A X
      C X
      C X
      C X
      A Z
      A Z
      C X
      A Z
      C Z
      C Z
      C X
      C Z
      B Y
      C X
      C X
      C X
      A Z
      A Z
      C X
      C X
      C X
      C Z
      A Z
      C X
      A X
      C Z
      C X
      B Y
      C X
      C Z
      C X
      C X
      A X
      A X
      B Y
      C Z
      C X
      C Z
      A Z
      C X
      A X
      A Z
      C X
      C X
      C Y
      C X
      A Z
      C X
      A Z
      B X
      A X
      A Z
      A Z
      A Z
      A Y
      A X
      C X
      C X
      A Z
      C Z
      C X
      C X
      A Z
      C Z
      C X
      C X
      C X
      C X
      C X
      C X
      A Z
      A Y
      C Z
      C X
      A Z
      A X
      C X
      C Z
      A Z
      C X
      B Y
      A Z
      A Z
      C X
      A Z
      C X
      C X
      A Z
      C X
      C Y
      C X
      C X
      B Y
      A Y
      A Z
      C X
      C X
      B Y
      C X
      C X
      C Z
      C Z
      C X
      B X
      C X
      C Z
      A Y
      C Z
      B Y
      C X
      C X
      B Y
      A Z
      B Y
      C Z
      A Y
      A Z
      B Y
      A X
      C X
      C X
      C Z
      C X
      A X
      C X
      C X
      C Z
      A Z
      A Z
      A Z
      C Z
      B X
      A Z
      A Z
      C X
      C X
      C X
      A Y
      A Z
      C Z
      C X
      C Z
      C X
      A Z
      C Z
      A Z
      C X
      B Y
      C Z
      C X
      C X
      A Z
      C Z
      C Z
      B X
      C Z
      C Z
      A Z
      A Y
      C X
      C X
      C Z
      C X
      A X
      C X
      C X
      C X
      C Z
      B Y
      B Y
      C X
      B Y
      C X
      C X
      C X
      A Z
      B Z
      C X
      C X
      C X
      C X
      C Z
      C X
      C X
      C X
      A Z
      C X
      B Y
      C X
      A Y
      B Z
      A Z
      C X
      B X
      A Y
      C Z
      C X
      C X
      C X
      C Z
      A Y
      C Y
      C X
      A Y
      A Y
      C X
      C X
      C X
      C X
      C Z
      B X
      C X
      C X
      C X
      A Z
      B X
      C X
      C X
      B Y
      C X
      C X
      C X
      A Z
      C X
      C X
      C X
      B Y
      C X
      B Z
      B X
      C Z
      C X
      C Z
      C X
      B X
      A Z
      C X
      C X
      A Z
      C Z
      C X
      A Z
      B Z
      C X
      A X
      A Z
      C Z
      C X
      C X
      B X
      B X
      C X
      B X
      C X
      C Z
      C X
      C X
      A Y
      A X
      A X
      C Z
      C Z
      A Z
      C Z
      C X
      C X
      C X
      C Z
      A X
      C Z
      A X
      C Z
      C X
      C X
      A Y
      C Z
      A Z
      A X
      A Z
      B Y
      C X
      C Z
      C X
      C X
      A X
      A X
      C X
      C X
      C X
      C X
      A Z
      C X
      C Z
      A X
      C X
      B Y
      C Z
      C X
      A X
      C X
      C Z
      C X
      A X
      A X
      A X
      C X
      A Z
      A X
      C Z
      C Z
      C X
      C Y
      A Y
      C X
      C X
      B X
      C X
      C X
      C Z
      B Y
      A Z
      C X
      B Y
      A Z
      C Z
      A Z
      A Y
      C Z
      B Z
      A X
      B Z
      C Z
      A X
      C Z
      A Z
      A Z
      B Z
      C X
      C X
      C X
      C X
      A X
      C X
      C X
      C X
      C X
      C X
      B Y
      C X
      C X
      C X
      B Z
      A Y
      A X
      C Z
      C X
      A Y
      B Y
      C X
      A Y
      A Z
      B X
      A Z
      C X
      B Y
      C X
      A Z
      A Z
      C X
      A Z
      A Z
      C X
      A X
      A Z
      C Z
      B Z
      C X
      A X
      C Y
      A Y
      C X
      A Z
      C X
      C X
      C X
      C Z
      C X
      C X
      C X
      A Y
      B Z
      A X
      A Z
      A Z
      C X
      A X
      B X
      C X
      B X
      C X
      A Z
      A X
      C X
      A X
      A Y
      A Y
      A Z
      A Z
      C X
      B X
      C X
      A Y
      C Z
      A Z
      C X
      C X
      A Y
      A Z
      B Y
      C X
      C X
      C X
      C X
      C X
      A Z
      C Z
      C X
      C X
      C Z
      C X
      C Z
      B Y
      C X
      A Z
      B X
      C Z
      C X
      C Z
      C Z
      C Z
      C X
      C X
      C Z
      C X
      C Z
      B Y
      C X
      C X
      A Z
      C X
      C X
      B Y
      C X
      C Z
      C X
      B X
      C Z
      A X
      C X
      C Z
      C X
      C Z
      B Y
      C X
      A Z
      A Y
      C X
      C Y
      B Z
      B X
      C X
      C X
      C Z
      C X
      B Y
      C X
      A Z
      A Y
      C X
      B Y
      C X
      C Z
      B Y
      C X
      A Y
      C X
      C X
      C X
      A Z
      C Z
      C X
      C X
      A X
      A Z
      C X
      C X
      A Y
      C X
      B Y
      C Z
      C Z
      C Z
      B Y
      C X
      C X
      C X
      C X
      A Y
      A Z
      A X
      C Z
      A Z
      A Z
      A Z
      C X
      A Y
      B X
      A Z
      C X
      C X
      B X
      C X
      C X
      C X
      B Y
      A Z
      A X
      A Z
      C X
      B X
      A X
      C X
      C X
      C X
      C X
      C X
      C Z
      A Z
      C X
      C X
      C Z
      C X
      A Y
      A Z
      C X
      A Z
      C X
      A Z
      C Z
      A Z
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      C X
      B Z
      C X
      A X
      C Z
      C X
      A X
      C Z
      A X
      B Y
      A Y
      C X
      A Z
      C X
      C X
      C X
      C X
      C X))

(def opponent-options    {:A :Rock :B :Paper :C :Scissors})
(def responding-options  {:X :Rock :Y :Paper :Z :Scissors})
(def option-score-values {:Rock 1 :Paper 2 :Scissors 3})
(def response-outcomes    {:X :Lose :Y :Draw :Z :Win})
  
(defn list->couplet
  ([input]
   (list->couplet (map keyword input) '()))
  ([input couplets]
   (if (empty? input)
     couplets
     (do (let [[f s & remaining] input]
           (list->couplet remaining (conj couplets [f s])))))))

(defn winning-choice [opponent-choice]
  (cond (= :Rock opponent-choice) :Paper
        (= :Paper opponent-choice) :Scissors
        (= :Scissors opponent-choice) :Rock))

(defn losing-choice [opponent-choice]
  (cond (= :Rock opponent-choice) :Scissors
        (= :Paper opponent-choice) :Rock
        (= :Scissors opponent-choice) :Paper))


(defn win? [opponent-choice responding-choice]
  (= responding-choice (winning-choice opponent-choice)))

(defn score-round [[encrypted-opponent-choice encrypted-responding-choice]]
  (let [opponent-choice (encrypted-opponent-choice opponent-options)
        responding-choice (encrypted-responding-choice responding-options)
        base-score (responding-choice option-score-values)]
    (cond (win? opponent-choice responding-choice) (+ 6 base-score)
          (= opponent-choice responding-choice) (+ 3 base-score)
          :else base-score)))

;a
(defn score-match [input]
  (apply + (map score-round (list->couplet input))))

;b
(defn predetermined-response [opponent-choice outcome]
  (cond (= :Lose outcome) (losing-choice opponent-choice)
        (= :Win outcome) (winning-choice opponent-choice)
        (= :Draw outcome) opponent-choice))

(defn score-predetermined-round [[encrypted-opponent-choice encrypted-responding-choice]]
  (let [opponent-choice (encrypted-opponent-choice opponent-options)
        outcome (encrypted-responding-choice response-outcomes)
        predetermined-response (predetermined-response opponent-choice outcome)
        base-score (predetermined-response option-score-values)]
    (cond (= :Win outcome) (+ 6 base-score)
          (= :Draw outcome) (+ 3 base-score)
          (= :Lose outcome) base-score)))

(defn score-predetermined-match [input]
  (apply + (map score-predetermined-round (list->couplet input)))
  )
