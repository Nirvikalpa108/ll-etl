@main def hello = println("Hello, World!")

trait Etl[A, B]:
  def extract(inputFilePath: String): A
  def transform(input: A): B
  def load(data: B, outputFilePath: String): Unit

