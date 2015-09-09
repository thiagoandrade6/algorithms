package com.studies.algorithms

/**
 * Created by Thiago Pereira on 9/9/15.
 * 
 * This is a simple Insertion Sort implementation
 *
 * Given two cards in your hand, the left is 5 and right is 2
 *
 * Take the card 2 and assign it to a called KEY variable
 * Get this card position(1) and assign to a called HOLDER variable
 *
 * While your card position(holder) is greater than 0 and
 * your left card is greater than your right card -> array(holder - 1) > key
 * turn your right card into your left card, keeping both equal, then
 * turn your left card into the original(key), making a swap
 *
 * Example:
 *
 * Your right card is now equal to your left card -> array(holder) = array(holder - 1)
 * then lets turn your left card into the original key in two steps
 *  1 - holder = holder - 1
 *  2 - array(holder) = key
 *
 */
object InsertionSort {

  def main(args: Array[String]) {
    val ints = Array(5, 2, 4, 6, 1, 3)
    println(insertionSort(ints).toList.toString())
  }

  def insertionSort(array: Array[Int]): Array[Int] = {
    for(i <- 1 until array.length) {
      val key = array(i)
      var holder = i
      while(holder > 0 && array(holder - 1) > key) {
        array(holder) = array(holder - 1)
        holder = holder - 1
      }
      array(holder) = key
    }
    array
  }
}