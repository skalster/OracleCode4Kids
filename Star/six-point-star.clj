; Six point star with rep
(reset)
(def steps 50)
(def angle120 120)
(def angle60 60)
(set-fill "pink") 

(defn section [] 
  (forward steps)
  (right angle60)
  (forward steps))

(defn sixPointStar []
  (rep 6
     (section)
     (left angle120)))

(filled
  (sixPointStar))
 