;;Circle
(reset)
(def steps 3)
(def angle 4)
(def repeat 90)
(set-fill "Blue")
;; Rep multiply by  angle must 360 
(filled
  (rep repeat
    (forward steps)
    (left angle)))

(hide)
