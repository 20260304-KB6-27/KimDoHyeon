<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="container-fluid">
        <a class="navbar-brand text-start">이날치(LeeNalChi)</a>

        <button
          class="navbar-toggler"
          data-bs-toggle="collapse"
          data-bs-target="#menu"
        >
          <span class="navbar-toggler-icon"></span>
        </button>

        <!-- 접히는 목록 -->
        <div class="collapse navbar-collapse" id="menu">
          <ul class="navbar-nav me-auto">
            <li class="nav-item">
              <RouterLink to="/" class="nav-link">홈</RouterLink>
            </li>
            <li class="nav-item">
              <RouterLink to="/about" class="nav-link">소개</RouterLink>
            </li>
            <li class="nav-item">
              <RouterLink to="/members" class="nav-link">멤버</RouterLink>
            </li>
            <li class="nav-item">
              <RouterLink to="/videos" class="nav-link">영상</RouterLink>
            </li>
          </ul>
        </div>
      </div>
    </nav>
  </div>
</template>

<script setup></script>

<style lang="scss" scoped></style>
