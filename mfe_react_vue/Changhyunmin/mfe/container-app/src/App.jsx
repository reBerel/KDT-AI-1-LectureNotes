import React, { useEffect, useRef, useState } from "react";
import { BrowserRouter } from 'react-router-dom'

import { mount } from 'vueModuleApp/Sample';
import { navigationMount } from 'vueNavigationApp/VueNavigation';

import Counter from 'reactModuleApp/Counter';
import BoardApp from 'reactBoardApp/BoardApp'

// import '사용하는 함수 'from 'remotes App'/'remotes의 exposes 설정(오른쪽 이름)'형태로 작성
import TodoApp from 'reactZustandTodoApp/ZustandTodoApp'
//React에 vue를 붙일 때는 실제 React와 vue의 동작이 다르기 때문에

const App = () => {
  const vueRef = useRef(null)
  const vuetifyNavigationRef = useRef(null)

  useEffect(() => {
    mount(vueRef.current)
    navigationMount(vuetifyNavigationRef.current)
  }, []);

  return (
    <div>
      <div style={{ zIndex: 999 }} ref={vuetifyNavigationRef}/>
      <div style=
          {{ margin: '10px', padding: '10px', textAlign: 'center',
              backgroundColor: 'cyan', position: 'relative', zIndex: 1 }}>
        <h1>나는 React로 만들어진 Container!</h1>
        <div ref={vueRef}/>
      </div>
      <div style={{ position: 'relative' }}>
      <Counter/>
      <BrowserRouter>
        <BoardApp/>
      </BrowserRouter>
      </div>
      <div>
      <TodoApp/>
      </div>
    </div>
  )
};

export default App;
