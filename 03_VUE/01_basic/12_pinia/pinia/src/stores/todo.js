import { defineStore } from 'pinia';
import { ref, reactive, computed } from 'vue';

export const useTodoListStore = defineStore('todoList', () => {
  const state = reactive({
    todoList: [
      { id: 1, todo: 'ES6학습', done: false },
      { id: 2, todo: 'React학습', done: false },
      { id: 3, todo: 'ContextAPI 학습', done: true },
      { id: 4, todo: '야구경기 관람', done: false },
    ],
  });

  const todoList = computed(() => state.todoList);

  // todo 추가
  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };

  // todo 삭제
  const deleteTodo = (id) => {
    const index = state.todoList.findIndex((todo) => id === todo.id);
    state.todoList.splice(index, 1);
  };

  // 완료 상태 토글
  const toggleTodo = (id) => {
    const index = state.todoList.findIndex((todo) => id === todo.id);
    state.todoList[index].done = !state.todoList[index].done;
  };

  // 완료 카운트
  const doneCount = computed(() => {
    return state.todoList.filter((todo) => todo.done === true).length;
  });

  return { todoList, addTodo, deleteTodo, toggleTodo, doneCount };
});
