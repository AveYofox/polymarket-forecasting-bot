;; Given an array of positive integers nums, remove the smallest subarray (possibly empty)
;; such that the sum of the remaining elements is divisible by p. It is not allowed to remove
;; the whole array.
;;
;; Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.
;;
;; A subarray is defined as a contiguous block of elements in the array.
;;
;; Example 1:
;; Input: nums = [3,1,4,2], p = 6
;; Output: 1
;; Explanation: The sum of the elements in nums is 10, which is not divisible by 6.
;; We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6.
;;
;; Example 2:
;; Input: nums = [6,3,5,2], p = 9
;; Output: 2
;; Explanation: We cannot remove a single element to get a sum divisible by 9.
;; The best way is to remove the subarray [5,2], leaving us with [6,3] with sum 9.
;;
;; Example 3:
;; Input: nums = [1,2,3], p = 3
;; Output: 0
;; Explanation: Here the sum is 6, which is already divisible by 3. Thus we do not need to remove anything.

(defun min-length-subarray (nums p)
  "Return the length of the smallest subarray to remove from NUMS such that the sum of the remaining elements is divisible by P."
  (let* ((total-sum (apply '+ nums))
         (target-remainder (mod total-sum p)))
    (if (zerop target-remainder)
        0  ;; Already divisible by p
      (let ((n (length nums))
            (min-length (1+ n))  ;; Start with a value larger than any possible subarray
            (prefix-sum (make-vector (1+ (length nums)) 0)))
        ;; Calculate prefix sums
        (dotimes (i n)
          (aset prefix-sum (1+ i) (+ (aref prefix-sum i) (nth i nums))))
        ;; Use a hash table to store the last index of each prefix sum modulo p
        (let ((last-index (make-hash-table :test 'equal)))
          (dotimes (i (1+ n))
            (let ((current-remainder (mod (aref prefix-sum (1+ i)) p)))
              (when (gethash current-remainder last-index)
                (let ((start-index (gethash current-remainder last-index)))
                  (setq min-length (min min-length (- i start-index)))))
              ;; Update the last index for the current remainder
              (unless (gethash current-remainder last-index)
                (puthash current-remainder i last-index)))))
        ;; Return the result
        (if (= min-length (1+ n))
            -1  ;; No valid subarray found
          min-length)))))

;; Example usage:
(min-length-subarray [3 1 4 2] 6)  ;; => 1
(min-length-subarray [6 3 5 2] 9)  ;; => 2
(min-length-subarray [1 2 3] 3)    ;; => 0
