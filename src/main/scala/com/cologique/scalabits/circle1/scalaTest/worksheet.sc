import com.cologique.scalabits.circle1.scalaTest._

object worksheet {
  val level =
"""-o----
  |-ooo--
  |--oo--
  |--oo--
  |-----o""".stripMargin






  for (i <- 0 to 3) yield {
    for (j <- 0 to 2) yield (i,j)
  }



  val board = new Board(Board.gridizer(level))






  val grid =
    for (y <- 0 until board.height) yield {
      for (x <- 0 until board.width) yield {
        print("("+x+","+y+")")
        board.isAlive(Board.Pos(x,y)) match {
          case true => 'o'
          case false => '-'
        }
      }
    }









  val testSeq = IndexedSeq(new Board(Board.gridizer(level)))






  val nextBoard: Board = testSeq.head.tick()






  testSeq :+ nextBoard













  /*
  board.grid map{row => printf(row.toString + "\n")}
  board.grid(0) map {cell => print(cell)}
  board.grid map{row => row map{ cell => print(cell) }; println()}
  */
  val pos_2_1 = Board.Pos(2,1)
  val pos_0_1 = Board.Pos(0,1)
  val pos_neg1_1 = Board.Pos(-1,1)
  val pos_neg1_neg1 = Board.Pos(-1,-1)
  val add_pos_2_1_and_pos_0_1 = pos_2_1 + pos_0_1

  val check_terrain_2_1 = board.positionCheck(pos_2_1)

  val check_terrain_0_1 = board.positionCheck(pos_0_1)
  val check_terrain_neg1_1 = board.positionCheck(pos_neg1_1)
  val check_terrain_neg1_neg1 = board.positionCheck(pos_neg1_neg1)
  val test_0_0 = board.neighborCheck(Board.Pos(0,0))
  val test_1_1 = board.neighborCheck(Board.Pos(1,1))
  val test_2_2 = board.neighborCheck(Board.Pos(2,2))
  val test_3_3 = board.neighborCheck(Board.Pos(3,3))
}

