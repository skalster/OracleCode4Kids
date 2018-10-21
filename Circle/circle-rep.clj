;;Circle
(reset)
(def steps 3)
(def angle 3)
(def repeat 120)
;; Rep multiply by  angle must 360 
(rep repeat
  (forward steps)
  (left angle))
