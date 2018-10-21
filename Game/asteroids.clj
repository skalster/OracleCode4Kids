

 *Learn how to build this game yourself!*  
  Improve it. Share it. 
  Then build other cool games.  
  Its in [\"George - the book\"](http://www.george.andante.no/book).
  "
  []
  (reset false)
  (set-background :black)
  (to-front)
  
  (let [spaceship
        (new-turtle
          :name :spaceship
          :speed nil
          :down false
          :shape (spaceship-shape)
          :heading 90
          :visible false)
        
        physics
        (new-turtle
          :name :physics
          :speed nil
          :down false
          :visible false
          :props {:step 0})
 
        scorekeeper
        (new-score-turtle)

        life-count_ 
        (atom 3)]

    (update-life-count life-count_ 0)

    (set-keys physics spaceship)

    (set-fence
      {:fence   (fn [turtle] (if (= (get-name turtle) :shot) :stop :wrap))
       :onfence (fn [turtle _] (when (= (get-name turtle) :shot)
                                     (delete-turtle turtle)))})

    (make-rocks)
    (set-ticker 
      #(game-loop physics spaceship scorekeeper life-count_))
    (start-ticker)
    (blink-in spaceship)))