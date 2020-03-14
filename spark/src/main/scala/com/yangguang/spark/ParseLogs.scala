package com.yangguang.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object ParseLogs {

  def main(args: Array[String]): Unit = {
    val sparkconf: SparkConf = new SparkConf().setMaster("local").setAppName("ScalaWorldCount")
    val sc: SparkContext = new SparkContext(sparkconf)
//    sc.textFile("F:\\Downloads\\07_kyy-log-37-03.log").map{x => _.split(" ").drop(2).mkString(" ").split("\\^")}
val value: RDD[String] = sc.parallelize(List("dog", "salmon", "salmon", "rat"), 3)

  }
}
