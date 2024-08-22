# mines-kotlin

## API

Game Object
ctor
- width: Int
- height: Int
- mineCount: Int
  fields
- isGameOver: Boolean
    - true if
        - endGameIfAllFlagsUsed is true and all flags are used
        - all non-mine cells are revealed (only mines are left)
        - a mine is revealed
- isGameWon: Boolean
    - true if
        - all mines are flagged
        - all non-mine cells are revealed
- timer: Long / FLOW
    - emits the time elapsed since the game started
      func
- clear(index: Int)
    - check the cell at the given index, and then calls either
        - onExplode or
        - onClear(value) or
        - onExpand or
        - onWin
- toggleFlag(index: Int)
    - toggles the flag on the cell at the given index
- cells: Array<Array<Cell>>
    - flatten cells to 2d: `private val cellList: List<Cell> = cells.flatten()`
- getNeighbors(Cell): List<Cell>
- pauseTimer()
- resumeTimer()

Cell Interface
- isMine: Boolean
- isRevealed: Boolean
- isFlagged: Boolean
- value: Int [0-8]