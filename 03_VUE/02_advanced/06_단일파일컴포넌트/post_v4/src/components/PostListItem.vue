<template>
  <li class="post-item-wrapper">
    <!-- 부모에게 togglePost 이벤트 요청 -->
    <div @click="emit('togglePost', post.no)" class="post-item">
      {{ post.no }}. {{ post.title }}
      <span class="arrow">{{ isOpen ? '▲' : '▼' }}</span>
    </div>

    <div v-if="isOpen" class="post-content">
      <div v-show="!isEdit">
        <h2>{{ post.title }}</h2>
        <p>{{ post.content }}</p>

        <div class="action">
          <button @click="emit('startEdit', post)">수정</button>
          <button @click="emit('deletePost', post.no)">삭제</button>
          <button @click="emit('closePost')">닫기</button>
        </div>
      </div>
      <div v-show="isEdit">
        <div class="editBox">
          <input type="text" v-model="editPost.title" />
          <textarea v-model="editPost.content">{{ editPost.content }}</textarea>
        </div>
        <div class="action">
          <button @click="emit('updatePost', editPost)">저장</button>
          <button @click="emit('closePost')">취소</button>
        </div>
      </div>
    </div>
  </li>
</template>

<script setup>
// 부모한테 있는 이벤트 정의
const emit = defineEmits([
  'togglePost',
  'startEdit',
  'updatePost',
  'deletePost',
  'closePost',
]);

// 부모한테 받은 props 정의
const props = defineProps({
  post: {
    no: Number || String,
    title: String,
    content: String,
  },
  isOpen: Boolean,
  isEdit: Boolean,
  editPost: {
    no: Number || String,
    title: String,
    content: String,
  },
});
</script>

<style lang="scss" scoped></style>
