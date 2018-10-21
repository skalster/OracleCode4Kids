;; 5 Point star
(reset)
;; Define constants
(def steps 50)
(def angle 144)
(set-fill "orange")

;;Define method
(defn star []
  (rep 5
    (forward steps)
    (left angle)
    (forward steps)
    (left (* 2 angle))))

;; Program
(filled
  (star))

;; Move forward to avoid writing over the previous star.
(pen-up)
(forward 200)
(pen-down)

;; Change the color to green and call the method star again.
(set-fill "green")
(filled
  (star))


(hide)