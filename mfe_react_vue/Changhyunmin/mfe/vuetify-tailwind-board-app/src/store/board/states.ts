export interface BoardState {
    boards: Board[]
    board: Board | null
}

export interface Board {
    boardId: number
    title: string
    writer: string
    content: string
    cteateData: string
    updateData: string
}

const state: BoardState = {
    boards: [],
    board:null,
}
export default state