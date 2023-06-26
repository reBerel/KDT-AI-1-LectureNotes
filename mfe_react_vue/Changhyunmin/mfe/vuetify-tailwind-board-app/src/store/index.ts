import { createStore,Store } from 'vuex'
import { InjectionKey} from 'vue'

import boardModule from './board/boardModule'

import { BoardState } from "./board/states";
import { BoardMutations } from './board/mutations'
import { BoardActions } from "./board/actions";

export interface RootState{}

export type AppStore = Store<RootState> & {
  getters: {
    boardModule: BoardState
  },
  commit<K extends keyof BoardMutations> (
    key: K,
    payload: Parameters<BoardMutations[K]>[1]
  ): ReturnType<BoardMutations[K]>
  dispatch<K extends keyof BoardMutations>(
    key: K,
    payload?: Parameters<BoardMutations[K]>[1]
  ): ReturnType<BoardMutations[K]>
}

export default createStore<RootState>({
  modules: {
    boardModule,
  }
})

export { boardModule}