;;ten-point-star
(reset)
(def steps 50)
(def angle90 90)
(def angle54 54)
(set-fill "red")
  
  
(defn tenPointStar [] 
  (forward steps)
  (left angle90)
  (forward steps)
  (right angle54))

(filled
  (rep 10 
     (tenPointStar)))


(hide)