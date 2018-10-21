;; eight point star with rep 

(reset)
(def steps 50)
(def angle45 45)
(def angle90 90)
(set-fill "red")
  
(defn star [] 
  (forward steps)
  (left angle90)
  (forward steps)
  (right angle45))

(filled
  (rep 8 
     (star)))

(hide)