;; Square with rep
(reset) ;; Clean the screen
;; Define constants
(def steps 50)
(def rightAngle 90)
(def sides 4)
;;
(rep sides
     (left rightAngle)
 (forward steps))
 
(hide)